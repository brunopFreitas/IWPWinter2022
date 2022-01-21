// Question 3
// 1 - Write a JavaScript program to iterate through an array of ten(10) positive randomly generated numbers 
// between 1 and 100. 
// 2 - Each number will then be checked to see if it’s a prime number. 
// 3 - Each determination should be added to a string that will be finally outputted such as below:
// Sample Expected Output (console.log() or document.write())
// 23-yes, 15-no, 22-no, 88-no, 11-yes, 9-no, 2-yes, 13-yes, 5-yes, 1-no

var myPrimeNumber = (function question3() {
    //Creating the array with random numbers, 100 included.
    'use strict';
    let randomNumberObject = [];
    for(let i=0;i<10;i++) {
        randomNumberObject.push(Math.round(Math.random()*100)+1);
    }
    return {
        getPrimeNumber: function findingPrimes() {
            let questionAnswer = [];
            //checking primes, between 1 and 100, if not divisable per 2,3,5,7 and 9, is probably prime.
            for (let i=0;i<randomNumberObject.length;i++) {
                if(randomNumberObject[i]%2!=0 && 
                    randomNumberObject[i]%3!=0 &&
                    randomNumberObject[i]%5!=0 &&
                    randomNumberObject[i]%7!=0 &&
                    randomNumberObject[i]%9!=0
                    //adding the concatenation between the number assessed and the answer to the answerArray.
                    ) {
                        questionAnswer[i]=randomNumberObject[i]+'-yes'

                } else {
                    questionAnswer[i]=randomNumberObject[i]+'-no'
                }

            }
            //Making everything become a string, separated by a comma and a space
            return questionAnswer.join(', ');
        }
    }
})();

console.log(myPrimeNumber.getPrimeNumber());


