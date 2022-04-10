(function() {

    //Function that will display an image in the DOM
    function displayImage(src, width, height, alt) {
        var a = document.createElement("img")
        a.src = src
        a.width = width
        a.height = height
        a.alt = alt
        document.body.appendChild(a)
    }

    //Function that will display a paragraph in the DOM
    function displayHandInformation(handRank) {
        const para = document.createElement("p");
        para.innerText = "The poker hand is: " + handRank
        document.body.appendChild(para)
    }

    //Function that fetch an api
    function callAPI() {
        //URL to fetch
        const url = "https://deckofcardsapi.com/"
        const contextNewDeck = "api/deck/new/shuffle/?"
        const cards = "cards=JS,JC,JH,JD,QS,QC,QH,QD,KS,KC,KH,KD,AC,AH,AD,2S,2C,2H,2D,3S,3C,3H,3D,7D,AS,7H,4C"
        const newDeck = url+contextNewDeck+cards
        console.log(newDeck)
        fetch(newDeck)
        .then(data=>{return data.json()})
        .then(response=>{  
            console.log(response)
            const deckID = response.deck_id
            const contextDrawCard = "api/deck/"
            const cardQuantity = "/draw/?count=6"
            const drawCard = url + contextDrawCard + deckID + cardQuantity
            console.log(drawCard)
            fetch(drawCard)
            .then(data=>{return data.json()})
            .then(response=>{ 
            //Displaying the cards in the DOM    
                console.log(response)  
                for(let i=0;i<response.cards.length;i++) {
                    displayImage(response.cards[i].image,170,170,'card')
                }
            })
        })
    }
    callAPI();
})()
