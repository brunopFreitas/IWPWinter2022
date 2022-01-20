// Question 2
// Write a JavaScript program to: 
// 1 - calculate the number of weeks, days, hours, minutes and seconds left until midnight on your birthday.
// 2 - The script does not have to prompt for your birthdate. 
// 3 - Simply assign it to a variable and start from there. Ex: var myNextBirthday = …your code here
// 4 - Expected sample output (console.log() or document.write()):
// return: There are 35 weeks, 3 days, 13 hours, 25 minutes, and 12 seconds until my next birthday!

var myNextBirthday = (function question2() {
    let nextBirthday = new Date("07/22/2022");
    let today = new Date();
    //Miliseconds in a day
    const oneDay = 1000 * 60 * 60 * 24;
    return {
        getDifference: function() {
            //the object that will be returned
            const timeUntilNextBirthday = {
                weeks: '', 
                days: '', 
                hours: '', 
                minutes: '', 
                seconds: ''
            };
            timeUntilNextBirthday.days = Math.round((nextBirthday.getTime() - today.getTime())/oneDay);
            timeUntilNextBirthday.weeks = Math.round(timeUntilNextBirthday.days/7);
            timeUntilNextBirthday.hours = timeUntilNextBirthday.days*24;
            timeUntilNextBirthday.minutes = timeUntilNextBirthday.hours*60;
            timeUntilNextBirthday.seconds = timeUntilNextBirthday.minutes*60;
            return timeUntilNextBirthday;
            }
        }
    }
)();

console.log(myNextBirthday.getDifference());