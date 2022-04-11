(function () {

    // Global variables
    let amIPlaying = false
    let userCards = []
    let pcCards = []
    let gameMatch = 1
    let userMatchPoint = 0
    let pcMatchPoint = 0
    let userGamePoint = 0
    let pcGamePoint = 0
    let matchRound = 1
    let placar = "placar"
    let match = "match"
    let round = "round"
    let gameLog = "gameLog"
    let backCard = "image/cardback.jpg"
    const url = "https://deckofcardsapi.com/"
    let deckID

    //Start
    function startAGame() {
        let newGame = document.getElementById("newGame")
        newGame.onclick = callAPI
    }

    //Function that will display an image in the DOM
    function displayImage(src, id) {
        let displayCard = document.getElementById(id)
        displayCard.src = src
        displayCard.style.filter = "brightness(1)"
    }

    //Function that will display a paragraph in the DOM
    function fillBoard(element, value) {
        if (element !== gameLog) {
            let boardElement = document.getElementById(element)
            boardElement.innerHTML = value
        } else {
            let boardElement = document.getElementById(element)
            boardElement.innerHTML += value + "</br>"
            boardElement.scrollTop = boardElement.scrollHeight;
        }
    }

    //PlayTruco
    function PlayTruco(response) {
        userCards = []
        pcCards = []
        for (let i = 0; i < response.cards.length; i++) {
            if (i <= 2) {
                // Fecthing user cards
                let elementID = "uc" + i
                userCards[i] = {
                    value: response.cards[i].value,
                    suit: response.cards[i].suit,
                    position: elementID,
                    played: false,
                    image: response.cards[i].image,
                    code: response.cards[i].code
                }
                displayImage(response.cards[i].image, elementID)
            } else {
                // Fecthing pc cards
                let elementID = "pc" + (i - 3)
                pcCards[i - 3] = {
                    value: response.cards[i].value,
                    suit: response.cards[i].suit,
                    position: elementID,
                    played: false,
                    image: response.cards[i].image,
                    code: response.cards[i].code
                }
            }
        }
        fillBoard(placar, `Game Placar</br>PC ${pcGamePoint} x ${userGamePoint} User`)
        fillBoard(match, `Game Match</br>Match ${gameMatch}</br>PC ${pcMatchPoint} x ${userMatchPoint} User`)
        fillBoard(round, `Game Round</br>Round ${matchRound}`)
        fillBoard(gameLog, "A new match begins")
        userChooseCard()
    }

    //Click on a card
    function userChooseCard() {
        for (let i = 0; i < userCards.length; i++) {
            document.getElementById(userCards[i].position).onclick = function () {
                playACard(userCards[i])
            }
        }
    }

    //Block click
    function noCLick() {
        for (let i = 0; i < userCards.length; i++) {
            document.getElementById(userCards[i].position).onclick = function () {
            }
        }
    }
    

    //playACard
    function playACard(userCard) {
        if (userCard.played !== true) {
            fillBoard(gameLog, "You played " + userCard.value + " of " + userCard.suit)
            userCard.played = true
            let removeCard = document.getElementById(userCard.position)
            hideAnElement(removeCard)
            let pcCard = pcChooseCard()
            whoWin(userCard, pcCard)
        } else {
            fillBoard(gameLog, "You have already played that card!")
        }

    }

    //WhoWin
    function whoWin(userCard, pcCard) {
        let roundPoint = normalizeMyResult(userCard, pcCard)
        if (roundPoint.userPoint > roundPoint.pcPoint) {
            userMatchPoint++
            fillBoard(gameLog, "You win!")
        } else if (roundPoint.userPoint === roundPoint.pcPoint) {
            pcMatchPoint++
            userMatchPoint++
            fillBoard(gameLog, "Draw!")
        } else {
            pcMatchPoint++
            fillBoard(gameLog, "Fidelis win!")
        }
        matchRound++
        fillBoard(round, `Game Round</br>Round ${matchRound}`)
        fillBoard(match, `Game Match</br>Match ${gameMatch}</br>PC ${pcMatchPoint} x ${userMatchPoint} User`)
        newMatch()
    }

    //NewMatch
    function newMatch() {
        if (gameMatch <= 22) {
            if (userMatchPoint === 2 || pcMatchPoint === 2) {
                noCLick()
                if (userMatchPoint > pcMatchPoint) {
                    fillBoard(gameLog, `User win match ${gameMatch}!`)
                    userGamePoint++
                } else if (userMatchPoint === pcMatchPoint) {
                    fillBoard(gameLog, `It's a draw!`)
                    userGamePoint++
                    pcGamePoint++
                } else {
                    fillBoard(gameLog, `Pc win the match ${gameMatch}!`)
                    pcGamePoint++
                }
                gameMatch++
                userMatchPoint = 0
                pcMatchPoint = 0
                matchRound = 1
                fillBoard(placar, `Game Placar</br>PC ${pcGamePoint} x ${userGamePoint} User`)
                fillBoard(match, `Game Match</br>Match ${gameMatch}</br>PC ${pcMatchPoint} x ${userMatchPoint} User`)
                fillBoard(round, `Game Round</br>Round ${matchRound}`)
                fillBoard(gameLog, `Starting a new match!`)
                setTimeout(() => null, 3000) 
                resetElement()               
                callAPI()
            }
        }
    }

    //ResetElement
    function resetElement() {
        document.getElementById("pc0").attributeStyleMap.clear();
        document.getElementById("pc0").src = backCard
        document.getElementById("pc1").attributeStyleMap.clear();
        document.getElementById("pc1").src = backCard
        document.getElementById("pc2").attributeStyleMap.clear();
        document.getElementById("pc2").src = backCard
        document.getElementById("uc0").attributeStyleMap.clear();
        document.getElementById("uc0").src = backCard
        document.getElementById("uc1").attributeStyleMap.clear();
        document.getElementById("uc1").src = backCard
        document.getElementById("uc2").attributeStyleMap.clear();
        document.getElementById("uc2").src = backCard
    }

    //Normalization
    function normalizeMyResult(userCard, pcCard) {
        let userPoint = 0
        let pcPoint = 0
        let cardHierarchy = [{
                value: "4",
                suit: "",
                point: 50
            },
            {
                value: "7",
                suit: "HEARTS",
                point: 45
            },
            {
                value: "ACE",
                suit: "SPADES",
                point: 40
            },
            {
                value: "7",
                suit: "DIAMONDS",
                point: 35
            },
            {
                value: "3",
                suit: "",
                point: 10
            },
            {
                value: "2",
                suit: "",
                point: 9
            },
            {
                value: "ACE",
                suit: "",
                point: 8
            },
            {
                value: "KING",
                suit: "",
                point: 3
            },
            {
                value: "JACK",
                suit: "",
                point: 2
            },
            {
                value: "QUEEN",
                suit: "",
                point: 1
            }
        ]
        cardHierarchy.forEach(element => {
            if (element.value === userCard.value) {
                if (element.suit === userCard.suit) {
                    userPoint = element.point
                } else if (element.suit === "") {
                    userPoint = element.point
                }
            }
        })
        cardHierarchy.forEach(element => {
            if (element.value === pcCard.value) {
                if (element.suit === pcCard.suit) {
                    pcPoint = element.point
                } else if (element.suit === "") {
                    pcPoint = element.point
                }
            }
        })
        let pointNormalized = {
            userPoint: userPoint,
            pcPoint: pcPoint
        }
        return pointNormalized
    }

    //PcChooseCard
    function pcChooseCard() {
        let pcCardJustPlayed = pcPlayACard()
        return pcCardJustPlayed
    }

    // PCPlayACard
    function pcPlayACard() {
        if (pcCards[0].played === false) {
            displayImage(pcCards[0].image, pcCards[0].position)
            pcCards[0].played = true
            hideAnElement(document.getElementById(pcCards[0].position))
            fillBoard(gameLog, "Fidelis played " + pcCards[0].value + " of " + pcCards[0].suit)
            return pcCards[0]
        } else if (pcCards[1].played === false) {
            displayImage(pcCards[1].image, pcCards[1].position)
            pcCards[1].played = true
            hideAnElement(document.getElementById(pcCards[1].position))
            fillBoard(gameLog, "Fidelis played " + pcCards[1].value + " of " + pcCards[1].suit)
            return pcCards[1]
        } else if (pcCards[2].played === false) {
            displayImage(pcCards[2].image, pcCards[2].position)
            pcCards[2].played = true
            hideAnElement(document.getElementById(pcCards[2].position))
            fillBoard(gameLog, "Fidelis played " + pcCards[2].value + " of " + pcCards[2].suit)
            return pcCards[2]
        }
    }

    //RemoveAnElement
    function hideAnElement(element) {
        element.style.filter = "brightness(0.3)"
    }   

    //drawCards
    function drawCards(deckID) {
        const contextDrawCard = "api/deck/"
        const cardQuantity = "/draw/?count=6"
        const drawCard = url + contextDrawCard + deckID + cardQuantity
        fetch(drawCard)
            .then(data => {
                if (data.ok) {
                    return data.json()
                } else {
                    console.log("Can't fetch a deck!")
                }
            })
            .then(response => {
                PlayTruco(response)
            })
    }

    //Function that fetch an api
    function callAPI() {
        //URL to fetch
        amIPlaying = true
        const contextNewDeck = "api/deck/new/shuffle/?"
        const cards = "cards=JS,JC,JH,JD,QS,QC,QH,QD,KS,KC,KH,KD,AC,AH,AD,2S,2C,2H,2D,3S,3C,3H,3D,7D,AS,7H,4C"
        const newDeck = url + contextNewDeck + cards
        fetch(newDeck)
            .then(data => {
                if (data.ok) {
                    return data.json()
                } else {
                    console.log("Can't fetch a deck!")
                }
            })
            .then(response => {
                deckID = response.deck_id
                drawCards(deckID)
            })
    }
    startAGame()
})()