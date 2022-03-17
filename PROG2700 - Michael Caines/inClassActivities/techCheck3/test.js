//DO NOT MODIFY THIS CODE IN ANY WAY....USED TO TEST YOUR getTotalPopulation FUNCTION
const test = {
    fontSize: '20px',
    passColor: '#00FF00',
    failColor: '#FF0000',
    correctOutput: 1608378516,
    run: function(input) {
        const displayInput = input === '' ? 'an Empty String' : input
        if(input === this.correctOutput) {
            console.log(
                `%cFUNCTION getTotalPopulation is CORRECT`, 
                `color: ${this.passColor}; font-size: ${this.fontSize};`
            )
        } else {
            console.log(
                `%cFUNCTION getTotalPopulation is INCORRECT\n\tExpected ${this.correctOutput} but instead got ${displayInput}`,
                `color: ${this.failColor}; font-size: ${this.fontSize};`)
        }
    },
    outputErrorMessage: function(error) {
        if(error.includes('getTotalPopulation is not defined')){
            console.log(
                `%cFUNCTION getTotalPopulation has not yet been defined`,
                `color: ${this.failColor}; font-size: ${this.fontSize};`)
        } else {
            console.log(
                `%cERROR: ${error}`,
                `color: ${this.failColor}; font-size: ${this.fontSize};`)
        }
    }
}
