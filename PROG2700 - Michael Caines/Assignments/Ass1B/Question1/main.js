// Question 1
// Write a function in JavaScript that will receive a string as a parameter and then perform the following:
// 1. Assign a string to a variable in your code as your starting point to use as an argument for your function.
// 2. If the first and last characters of the string are the same (ignoring case), the function will return the string in reverse order. 
// 3. Otherwise, the function will return the string with the first and last letters removed.
// Example: “Triscuit” returns “tiucsirT” but “Cracker” returns “racke”.
// NOTE: Your program doesn't need to prompt for the string. 
// You can directly assign the string to your variable in the code.



var wordChanged = (function question1() {
    'use strict';
    return {
        getWord: function(word) {
            let newWord = [];
            //Item 2
            if(word[0].toLowerCase()===word[word.length-1].toLowerCase()) {
                for(let i=0;i<word.length;i++) {
                    newWord.unshift(word[i]);
                }
                return newWord.join('');
            //Item 3
            } else {
                newWord = word.split("");
                newWord.pop();
                newWord.shift();
                return newWord.join('');
                }
            }
    }        
})();
//Item 1
 console.log(wordChanged.getWord(originalWord = 'Triscuit'));
