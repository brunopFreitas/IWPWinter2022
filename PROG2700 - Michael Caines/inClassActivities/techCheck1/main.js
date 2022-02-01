(function(testFunction){
    /*
    * PHONEWORDS
    * Write a function that will take a phone word (vanity number) and return the correct telephone number.
    * The number pad looks like the following:
    * https://en.wikipedia.org/wiki/Telephone_keypad#/media/File:Telephone-keypad2.svg
    *
    * RULES
    * Given a phoneword:
    * 1. Ignore any non-alphanumeric characters (), -, etc.
    * 2. Keep any existing digits
    * 3. Resolve a letter to a number according to the keypad image
    * 4. All your code must be contained inside the 'convertPhoneWord' function shown below
    * 5. Your ultimate solution must work for ANY phoneword and not simply be implemented to cause the provided tests to pass.
    */


    var buttons = ["abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"] //DO NOT MODIFY
//                   2     3     4     5     6     7      8     9                      

    // YOU CAN ADD TO AND MODIFY THE CODE BELOW THIS LINE
    //   |
    //   V

    var convertPhoneWord = function(phoneWord) {

        //Enter your code in this function body
        let convertedPhoneWord=[];
        if(typeof phoneWord == 'string') {
            let newPhoneWord = phoneWord.toLowerCase().split('');
            for (let i=0;i<newPhoneWord.length;i++) {
                if(isDigit(newPhoneWord[i])) {
                    convertedPhoneWord.push(newPhoneWord[i]);
                } else if (isLetter(newPhoneWord[i])) {
                    for(let j=0;j<buttons.length;j++) {
                        if(buttons[j].includes(newPhoneWord[i])) {
                            switch(j) {
                                case 0:
                                    convertedPhoneWord.push('2')
                                    break;
                                case 1:
                                    convertedPhoneWord.push('3')
                                    break;
                                case 2:
                                    convertedPhoneWord.push('4')
                                    break;
                                case 3:
                                    convertedPhoneWord.push('5')
                                    break;
                                case 4:
                                    convertedPhoneWord.push('6')
                                    break;
                                case 5:
                                    convertedPhoneWord.push('7')
                                    break;
                                case 6:
                                    convertedPhoneWord.push('8')
                                    break;
                                case 7:
                                    convertedPhoneWord.push('9')
                                    break;                               
                            }
                        }
                    }
                }
            }
        }
        return convertedPhoneWord.join('');
    }

    //    ^
    //    |
    //YOU CAN ADD TO OR MODIFY THE CODE ABOVE THIS LINE




    // DO NOT CHANGE ANY CODE AFTER THIS LINE.
    //     |
    //     |
    //     V


    //helper functions...do not modify, but you can use them in your code if you wish.

    var isDigit = function(character) {
        return "0123456789".indexOf(character) !== -1;
    }

    var isLetter = function(character) {
        character = character.toUpperCase();    
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(character) !== -1;
    }

    //Run tests on the function
    testFunction(convertPhoneWord); //DO NOT MODIFY

    
})(testFunction);
