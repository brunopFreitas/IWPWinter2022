// Using the data retrieved from the API Endpoint below, 
// write a function called 'getTotalPopulation' that returns the total population
// for all countries that BOTH border China and list English as one of their official languages

//  NOTE: You are NOT permitted to use FOR, FOREACH, FOR OF or WHILE loops of any kind.
//  You must leverage any of the available JavaScript Array Iteration Functions to accomplish your goal. (except forEach!)
//  https://www.w3schools.com/js/js_array_iteration.asp
//  https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array#Iteration_methods

// MARKING
// -------
// 10/10 - Tech check is correct (passes all tests) and is completed 
//         and submitted within the allotted in-class time.

//  8/10 - Tech check is correct (passes all tests) and is completed 
//         and submitted within a 12-hour grace period beginning 
//         immediately following the end of in-class time.

//  6/10 - Tech check is correct (passes all tests) and is completed 
//         and submitted after the 12-hour grace period has elapsed.

//  0/10 - Tech check is not submitted or is submitted but does not pass all tests.


(function(test){

    // DO NOT MODIFY THE CODE BELOW
    // |          |           |
    // V          V           V
        fetch(`https://prog2700.netlify.app/json/restcountries/v2/all.json`)
        .then(response => response.json())
        .then(json => {
            try{
                //DO NOT MODIFY THIS CODE
                document.write(`The total population of countries that border China and list 
                                English as an official language is ${getTotalPopulation(json)}`)
                test.run(getTotalPopulation(json)) // will output test result to browser console
            } catch(e) {
                test.outputErrorMessage(e.message);
            }
        })
    // ^          ^           ^
    // |          |           |
    // DO NOT MODIFY  THE ABOVE CODE
    
    
    // WRITE YOUR getTotalPopulation FUNCTION HERE
    // |           |             |           |
    // V           V             V           V
    let getTotalPopulation = (json) => {
        let chinaBorder = json
            .filter(element => {
                if (element.hasOwnProperty('borders') && element.hasOwnProperty('languages')) {
                     if (element.borders.includes("CHN")) {
                        return element
                     }
                }
        })
        let chinaBorderEngLang = chinaBorder
        .filter(element => {
            if(element.languages.some(lang => {
                if(lang.name==="English") {
                    return true
                }
            })) {
                return element
            }                        
        })
        let totalPopulation = (total, elem)=> total + elem.population
        return chinaBorderEngLang.reduce(totalPopulation,0)       
    }
})(test);
