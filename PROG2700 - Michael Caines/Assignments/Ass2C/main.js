let pokerHand = () => {

    function displayImage(src, width, height, alt) {
        var a = document.createElement("img")
        a.src = src
        a.width = width
        a.height = height
        a.alt = alt
        document.body.appendChild(a)
    }

    function displayHandInformation(handRank) {
        const para = document.createElement("p");
        para.innerText = "The poker hand is: " + handRank
        document.body.appendChild(para)
    }

    function callAPI() {
        let valueRepetition=0
        let suitRepetition=0
        let sequence=0
        let highestSequence=0
        let cardInSequence=[]
        let deck = {
            value: [
                "2","3","4","5","6","7","8","9",
                "10","JACK","QUEEN","KING","ACE"
            ]
        }
        const url = 'https://deckofcardsapi.com/api/deck/new/draw/?count=5'
        fetch(url)
        .then(data=>{return data.json()})
        .then(response=>{          
            for(let i=0;i<response.cards.length;i++) {
                displayImage(response.cards[i].image,160,160,'card')
                for(let j=i+1;j<response.cards.length;j++) {
                    if(response.cards[i].value===response.cards[j].value) {
                        valueRepetition++
                    }
                    if (response.cards[i].suit===response.cards[j].suit) {
                        suitRepetition++
                    }
                }
                for(let k=0;k<deck.value.length;k++) {
                    if(response.cards[i].value===deck.value[k]) {
                        cardInSequence.push(deck.value.indexOf(deck.value[k])+1)
                    }
                }
            }
            //https://stackoverflow.com/questions/1063007/how-to-sort-an-array-of-integers-correctly
            cardInSequence.sort(function(a, b) {
                return a - b;
                })
            
                for(let r=0;r<cardInSequence.length;r++) {
                    if((cardInSequence[r]+1)===cardInSequence[r+1]) {
                        sequence++
                    }
                    highestSequence+=cardInSequence[r]
                }

            if(valueRepetition===0 && suitRepetition<10 && sequence<4) {
                displayHandInformation("High Card - " + deck.value[cardInSequence[4]-1])
            } else if (valueRepetition===1 && suitRepetition<10){
                displayHandInformation("Pair")
            } else if (valueRepetition===2 && suitRepetition<10) {
                displayHandInformation("Two Pair")
            } else if (valueRepetition===3 && suitRepetition<10) {
                displayHandInformation("Three of a Kind")
            } else if (sequence===4 && suitRepetition<10) {
                displayHandInformation("Straight")
            } else if (valueRepetition<4 && suitRepetition===10 && sequence<4) {
                displayHandInformation("Flush")
            } else if (valueRepetition===4 && suitRepetition<10) {
                displayHandInformation("Full House")
            } else if (valueRepetition===6 && suitRepetition<10) {
                displayHandInformation("Four of a kind")
            } else if (sequence===4 && suitRepetition===10 && highestSequence<55) {
                displayHandInformation("Straight Flush")
            }  else if (sequence===4 && suitRepetition===10 && highestSequence===55) {
                displayHandInformation("Royal Flush")
            }
            // console.log(valueRepetition)
            // console.log(suitRepetition)
            // console.log(cardInSequence)
            // console.log(sequence)
            // console.log(highestSequence)
        })
    }
    callAPI();
}
pokerHand();
