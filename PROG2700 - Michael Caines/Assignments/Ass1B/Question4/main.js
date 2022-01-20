// Question 4
// 1 - Write a function in JavaScript that will return the largest sum 
// of the longest streak of consecutive increasing numbers within an array.
// 2 - If there are no consecutive numbers in the array, the function will return zero.
// 3 - If there are multiple instances of the same number of consecutive numbers 
// (increasing by 1) in the array, the function will return the largest sum calculated between all instances.
// Examples:
// [1, 2, 3, 6, 9, 34, 2, 6] should return 6 because the longest streak of numbers is 1+2+3
// [3, 2, 7, 5, 6, 7, 3, 8, 9, 10, 23, 2, 1, 2, 3] should return 27 because the longest consecutive streak 
// is 3, it happens three times and the highest one is 8+9+10
// [100, 101, 102, 3, 4, 5, 6, 9] would return 18 because the longest streak is 4 (3+4+5+6)

var theLargestSum = (function question4() {
        let theObject = [3, 2, 7, 5, 6, 7, 3, 8, 9, 10, 23, 2, 1, 2, 3];
        let onlySequenceObject =[];
        let theLargestStreak = [];
        let biggestStreak=0;
        let biggestStreakLength=0;
        let theSum=0;
        let biggestStreakPosition=0;
        return {
            getTheLargestSum: function findTheLargestSum() {
                //Finding sequencied numbers in an array and creating a new one.
                //The new array will only contain numbers in sequence, segmented by 'Break'strings.
                for(let i=0;i<theObject.length;i++) {
                    //For the first position
                    if(i===0 && theObject[i+1]===theObject[i]+1) {
                        onlySequenceObject.push(theObject[i]);
                    //analyzing the previou and the next object to push into a new array
                    } else if (theObject[i+1]===theObject[i]+1 || theObject[i-1]===theObject[i]-1) {
                        //If the object is part of a sequence, analyzing the previous position
                        //If the previou object is different from the current one -1, insert string 'Break'
                        if(theObject[i-1]!==theObject[i]-1) {
                            onlySequenceObject.push('Break');
                            onlySequenceObject.push(theObject[i]);
                        //If the previous object is equal to the current one -1, push the current one.
                        } else {
                            onlySequenceObject.push(theObject[i]);
                        }                      
                    } else {
                        onlySequenceObject.push("Break");
                    }
                }
                onlySequenceObject.push("Break");
                //Creating a multidimensional array
                //Using the origintal length of the array because splice turn it dynamic
                let onlySequenceObjectLength = onlySequenceObject.length;
                for(let i=0;i<onlySequenceObjectLength;i++) {
                  let index = onlySequenceObject.indexOf('Break');
                  if(index===0) {
                    onlySequenceObject.shift();
                  } else {
                    theLargestStreak.push(onlySequenceObject.splice(0,index));
                  }  
                }                
                //Analyzing the conditions
                for(let i=0;i<theLargestStreak.length;i++) {
                    if(theLargestStreak[i].length > biggestStreakLength) {
                        biggestStreakLength = theLargestStreak[i].length;
                        biggestStreakPosition = i;
                    } else if (theLargestStreak[i].length===biggestStreakLength) {
                        let biggestStreakObjectActual = theLargestStreak[i];
                        let biggestStreakObjectPrevious = theLargestStreak[biggestStreakPosition];
                        let biggestStreakObjectActualSum=0;
                        let biggestStreakObjectPreviousSum=0;
                        for(let i=0;i<biggestStreakObjectActual.length;i++) {
                            biggestStreakObjectActualSum += biggestStreakObjectActual[i];
                        }
                        for(let i=0;i<biggestStreakObjectPrevious.length;i++) {
                            biggestStreakObjectPreviousSum += biggestStreakObjectPrevious[i];
                        }
                        if(biggestStreakObjectActualSum>biggestStreakObjectPreviousSum) {
                            biggestStreakPosition = i;
                        }
                    }
                }
                //Sum the values
                let biggestStreakObject = theLargestStreak[biggestStreakPosition];
                for(let i=0;i<biggestStreakObject.length;i++) {
                    theSum += biggestStreakObject[i];
                }

                return theSum;
            }
        }
    }
)();

console.log(theLargestSum.getTheLargestSum());