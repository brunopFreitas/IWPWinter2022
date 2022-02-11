const counts = {};
const sampleArray = ['a', 'a', 'b', 'c'];
//forEach (function)
sampleArray.forEach(
    function (x) {
        counts[x] = (counts[x] || 0) + 1; 
    });
let obj = {};
obj["x"] = 2;
obj["y"] = 4;
console.log(obj);
console.log((obj["x"] || 22)+1)
console.log(counts)