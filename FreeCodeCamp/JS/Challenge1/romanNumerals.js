
function romanDecimalConverter(num) {
    let plainRomanObject = [];
    let X=0;
    do {
        switch(true) {
            case num >= 10:
                do {
                    num=num-10;
                    X++;
                }while(num>=10)
                break;
            case num===9:
                plainRomanObject.push("IX");
                num=num-9;
                break;
            case num===8:
                plainRomanObject.push("VIII");
                num=num-8;
                break;
            case num===7:
                plainRomanObject.push("VII");
                num=num-7;
                break;
            case num===6:
                plainRomanObject.push("VI");
                num=num-6;
                break;
            case num===5:
                plainRomanObject.push("V");
                num=num-5;
                break;
            case num===4:
                plainRomanObject.push("IV");
                num=num-4;
                break;
            case num===3:
                plainRomanObject.push("III");
                num=num-3;
                break;
            case num===2:
                plainRomanObject.push("II");
                num=num-2;
                break;            
            case num===1:
                plainRomanObject.push("I");
                num=num-1;
                break;     
        }
    }while(num>0)
    if(X>0) {
        plainRomanObject.unshift("X".repeat(X));
    }    
    return plainRomanObject;
}

let romanDecimalConverted = romanDecimalConverter(39);
console.log(romanDecimalConverted.join(''));