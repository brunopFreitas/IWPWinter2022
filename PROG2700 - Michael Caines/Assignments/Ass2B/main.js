function callAPI() {
    const url = 'https://api.nobelprize.org/2.1/laureates'
    fetch(url)
    .then(data=>{return data.json()})
    .then(response=>{
        document.write("Hi. This is assignment 2B - Make an API call. <br>")
        document.write("Please see the full object in the console. <br>")
        console.log(response)
        document.write("<br> Those are the persons who have a Nobel Prize: <br><br>")
        for(let i=0;i<response.laureates.length;i++) {
            document.write(JSON.stringify(response.laureates[i].knownName.en)+"<br>")
        }
        document.write("<br> This is a list of countries that has a Nobel Prize: <br><br>")
        for(let i=0;i<response.laureates.length;i++) {
            document.write(JSON.stringify(response.laureates[i].birth.place.country)+"<br>")
        }
    })
}
callAPI();


