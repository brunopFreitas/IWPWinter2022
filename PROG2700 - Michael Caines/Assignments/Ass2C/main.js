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
        //List of variables
        let valueRepetition=0
        let suitRepetition=0
        let sequence=0
        let highestSequence=0
        //Ordered array
        let cardInSequence=[]
        //benchmark
        let deck = {
            value: [
                "2","3","4","5","6","7","8","9",
                "10","JACK","QUEEN","KING","ACE"
            ]
        }
        //URL to fetch
        const url = 'https://deckofcardsapi.com/api/deck/new/draw/?count=5'
        fetch(url)
        .then(data=>{return data.json()})
        .then(response=>{    
            //Displaying the cards in the DOM      
            for(let i=0;i<response.cards.length;i++) {
                displayImage(response.cards[i].image,170,170,'card')
                //Counting how many times a value or a suit repeats.
                //I'm comparing the current position with all next values.
                //Which means I'm not counting how many times a value or suit appears in a hand
                //but how many times each position in the array repeats itself through the next positions
                //Hence, by this logic this will happen:
                // valueRepetition for a pair = 1
                // valueRepetition for two pair = 2
                // valueRepetition for Three of a Kind = 3
                // valueRepetition for a full house = 6
                // suitRepetition for 5 equal suits is 10
                // I explain this better bellow
                for(let j=i+1;j<response.cards.length;j++) {
                    if(response.cards[i].value===response.cards[j].value) {
                        valueRepetition++
                    }
                    if (response.cards[i].suit===response.cards[j].suit) {
                        suitRepetition++
                    }
                }
                //Here I'm comparing the hand obtained by the API with my benchmark
                //and storing the index of my benchmark in order to know the highest card
                for(let k=0;k<deck.value.length;k++) {
                    if(response.cards[i].value===deck.value[k]) {
                        cardInSequence.push(deck.value.indexOf(deck.value[k])+1)
                    }
                }
            }
            //Here I've cheated with a piece of code that contains a recurrent function
            //that will sort the array in ascending order.
            //source: https://stackoverflow.com/questions/1063007/how-to-sort-an-array-of-integers-correctly
            cardInSequence.sort(function(a, b) {
                return a - b;
                })
            //Here I'm comparing each element with the next one to see if they are a sequence
            //If they are a sequence I'm counting how many times this sequence repeats
            //Which means 5 cards in sequence will provide a count of 4.
                for(let r=0;r<cardInSequence.length;r++) {
                    if((cardInSequence[r]+1)===cardInSequence[r+1]) {
                        sequence++
                    }
                    highestSequence+=cardInSequence[r]
                }

            //Here I'm applying each logic stated above inside if's to find out the poker hand.
            //High card must have no value repetition, max 4 same suits and max 4 cards in sequence
            //I know which card is the highest because I have and ordered array, so it will always be
            //the last value.
            if(valueRepetition===0 && suitRepetition<10 && sequence<4) {
                displayHandInformation("High Card - " + deck.value[cardInSequence[4]-1])
            //a pair must have 1 valueRepetition and max 4 same suits
            //For instance 4 4 5 6 7
            //I'm comparing the current value with the next ones.
            // The first 4 repeats only once.
            // The second 4 does not repeat.
            // valueRepetition = 1
            } else if (valueRepetition===1 && suitRepetition<10){
                displayHandInformation("Pair")
            //two pair must have 2 value repetition and max 4 same suits
            //For instance 4 4 5 5 7
            //I'm comparing the current value with the next ones.
            // The first 4 repeats only once.
            // The second 4 does not repeat.
            // The first 5 repeats only once.
            // The second 5 does not repeat.
            // valueRepetition = 2
            } else if (valueRepetition===2 && suitRepetition<10) {
                displayHandInformation("Two Pair")
            //three of a kind must have 3 value repetition and max 4 same suits
            //For instance 4 4 4 6 7
            //I'm comparing the current value with the next ones.
            // The first 4 repeats two times.
            // The second 4 repeats only once.
            // The third 4 does not repeat.
            // valueRepetition = 3
            } else if (valueRepetition===3 && suitRepetition<10) {
                displayHandInformation("Three of a Kind")
            //a straight must have sequence equals 4 (5 cards in sequence) and max 4 same suits
            //For instance 4 5 6 7 8
            // 4->5 = 1 sequence
            // 5->6 = 1 sequence
            // 6->7 = 1 sequence
            // 7->8 = 1 sequence
            // sequence=4
            } else if (sequence===4 && suitRepetition<10) {
                displayHandInformation("Straight")
            //a flush must have max 4 cards in sequence, max 3 repeated cards and 5 same suits
            //For instance CLUBS CLUBS CLUBS CLUBS CLUBS
            //I'm comparing the current value with the next ones.
            // The first CLUBS repeats 4 times.
            // The second CLUBS repeats 3 times.
            // The third CLUBS repeats 2 times.
            // The fourth CLUBS repeats 1 times.
            // The fiveth CLUBS does not repeat.
            // suitRepetition=10
            } else if (valueRepetition<4 && suitRepetition===10 && sequence<4) {
                displayHandInformation("Flush")
            //a full house must have 4 value repetition and max 4 same suits
            // For instance: 4 4 3 3 3
            // I'm always comparing the current value with the next ones.
            // They first 4 repeats 1 times.
            // The second 4 does not repeat.
            // The first 3 repeats 2 times.
            // the second 3 repeats 1 time.
            // The last 3 does not repeat.
            // valueRepetition = 4.
            } else if (valueRepetition===4 && suitRepetition<10) {
                displayHandInformation("Full House")
            //a four of a kind must have 6 valueRepetition and max 4 same suits.
            // For instance: 4 4 4 4 5
            // I'm always comparing the current value with the next ones.
            // They first 4 repeats 3 times.
            // The second 4 repeats 2 times.
            // The third 4 repeats only once.
            // Sum of repetition = 6.
            } else if (valueRepetition===6 && suitRepetition<10) {
                displayHandInformation("Four of a kind")
            //The logic of the straight flush is a combination between flush and straight
            //however, there's a new variable called highestSequence, which means:
            //I'm summing the index of my benchmark ("2" to "ACE" has index beginning at 1 ending at 13)
            //So, the highest sequence will assume index of 13,12,11,10,9=55
            //Hence highestSequence=13+12+11+10+9=55 to be a royal flush
            } else if (sequence===4 && suitRepetition===10 && highestSequence<55) {
                displayHandInformation("Straight Flush")
            //The logic of the royal flush is the same of the straight flush
            //however, highestSequence must be 55.
            }  else if (sequence===4 && suitRepetition===10 && highestSequence===55) {
                displayHandInformation("Royal Flush")
            }
        })
    }
    callAPI();
})()
