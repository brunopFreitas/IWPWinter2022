(function(){
	
	//Choose an array method to implement for each of the incomplete functions.
	//You MUST only use a combination of MAP, FILTER, and REDUCE array functions in order to accomplish your goal.
	//No use of for loops of any kind or the forEach function is permitted.

	//Remember, you can if you wish chain together array function calls to attain your goals.
	// Ex: array.filter().map()

	//Get data for the TV Show "Friends"
	fetch('http://api.tvmaze.com/shows/431?embed[]=episodes&embed[]=cast')
	    .then(function(response){
	        return response.json();
	    })
	    .then(function(json){

	        //DO NOT MODIFY THE CODE IN HERE...check the console for your functions' output

	        //1 - Implement the function called getGuntherCount which returns the total number of episodes 
	        // where the character Gunther is mentioned in the episode summary.
	        console.log('--------------------------------');
	        console.log(`Gunther Count: ${getGuntherCount(json)}`);

	        //2 - Implement the function called getTotalRuntimeMinutes() that totals all runtime minutes for all episodes
	        console.log('--------------------------------');
	        console.log(`Total Runtime Minutes: ${getTotalRuntimeMinutes(json)}`);

	        //3 - Implement the function called getTotalEpisodesInYear() that returns the number 
			// of episodes that aired in the year 2000
	        console.log('--------------------------------');
	        console.log(`Total episodes airing in year 2000: ${getTotalEpisodesInYear(json, '2000')}`);

	        //4 - Implement the function called getFemaleCastMembers() that returns an array of 
			// the names of the female cast members.
	        console.log('--------------------------------');
	        console.log(`Female Cast Members:`);
	        console.log(getFemaleCastMembers(json));

	        //5 - Implement the function called getEpisodeTitles() which returns a list of episode
	        //    where the argument string is found in the episode summary.
	        console.log('--------------------------------');
	        console.log(`Episodes that mention Ursula:`);
	        console.log(getEpisodeTitles(json, 'Ursula'));

	        //6 - Implement the function called getCastMembersOver55() which returns a list of cast 
			// members
	        //    who are currently 55 years of age or older.
	        console.log('--------------------------------');
	        console.log(`Cast Members who are currently 55 or older:`);
	        console.log(getCastMembers55OrOlder(json));

	        //7 - Implement the function called getTotalRuntimeMinutesExcludingSeasonSix 
			// that gets the total 
	        //    runtime minutes for all episodes excluding episodes in season 6
	        console.log('--------------------------------');
	        console.log(`Total runtime in minutes excluding Season 6: ${getTotalRuntimeMinutesExcludingSeasonSix(json)}`);
    
	        //8 - Implement the function called getFirstFourSeasons that gets the episodes 
			// for the first four seasons 
	        // but only return an array of JSON objects 
			// containing the season number and episode name
	        console.log('--------------------------------');
	        console.log(`Episode JSON for first four seasons:`)
	        console.log(getFirstFourSeasons(json));

	        //9 - Implement the function called getEpisodeTallyBySeason that returns an object 
			// containing the season name and the total episodes as key:value pairs for each season
	        console.log('--------------------------------');
	        console.log(`Tally of episodes by season:`);
	        console.log(getEpisodeTallyBySeason(json));

	        //10 - Implement the function called capitalizeTheFriends that transforms the episode JSON data by capitalizing the words 
			// Joey, Chandler, Monica, Rachel, Phoebe, and Ross in both 
	        // the name and summary of the episodes.
	        console.log('--------------------------------');
	        console.log(`Capitalized Friends:`);
	        console.log(capitalizeTheFriends(json));

	    })

	// COMPLETE THE FOLLOWING FUNCTIONS BY IMPLEMENTING MAP, REDUCE, OR FILTER 
	// (or a combination) ON THE PROVIDED JSON DATA

	// Complete the required ten functions below this line...
	function getGuntherCount(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let hasGunther = (elem) => elem.summary.includes('Gunther')			
		let guntherEp = episodes.filter(hasGunther)
		return guntherEp.length
	}
	
	function getTotalRuntimeMinutes(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let totalRuntime = (total, elem)=> total + elem.runtime
		return episodes.reduce(totalRuntime,0)
	}
	
	function getTotalEpisodesInYear(json, year) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let hasYear = (elem) => elem.airdate.includes(year)
		let epYear = episodes.filter(hasYear)
		return epYear.length
	}
	
	function getFemaleCastMembers(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].cast;
		let person = (elem) => elem.person.gender==="Female"
		let femaleCastName = (elem)=>elem.person.name;
		let femaleCast = episodes.filter(person).map(femaleCastName)
		return femaleCast

	}
	
	function getEpisodeTitles(json, name) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let hasName = (elem) => elem.summary.includes(name)
		let getName = (elem)=> elem.name;	
		let nameEp = episodes.filter(hasName).map(getName)
		return nameEp
	}
	
	function getCastMembers55OrOlder(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].cast;
		let person = (elem)=>{
			//I've cheated to get the actor's age: https://www.codegrepper.com/code-examples/javascript/javascript+calculate+age
			let ageInMilliseconds = new Date() - new Date(elem.person.birthday);
			ageInMilliseconds = Math.floor(ageInMilliseconds/1000/60/60/24/365); // convert to years
			if(ageInMilliseconds>=55) {
				return elem
			}
		}
		let getCast = (elem)=> elem.person.name;
		let getCast55Older = episodes.filter(person).map(getCast)
		return getCast55Older
	}
	
	function getTotalRuntimeMinutesExcludingSeasonSix(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let everythingButSeasonSix = (elem)=> elem.season!=6
		let totalRuntime = (total, elem)=> total + elem.runtime
		return episodes.filter(everythingButSeasonSix).reduce(totalRuntime,0)
	}
	
	function getFirstFourSeasons(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let onlyFirstFourSeason = (elem) => elem.season>=1 && elem.season<=4
		let firstFourSeasonObject = (elem) => ({season: elem.season, name: elem.name});
		return episodes.filter(onlyFirstFourSeason).map(firstFourSeasonObject)
	}
	
	function getEpisodeTallyBySeason(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes
		let numberOfSeasons = episodes.reduce((count, elem)=>{
			//Separate the episodes in chunks per season and counts how many elements are inside each chunk
			//I`ve cheated: https://stackoverflow.com/questions/5667888/counting-the-occurrences-frequency-of-array-elements/54525410
			//The statement ? : works like an if (condition) ? (if true) : (if false)
			//, counts means return count and count is an object
			return count[elem.season] ? ++count[elem.season] : count[elem.season] = 1, count
		}, {})
		return numberOfSeasons
	}
	
	function capitalizeTheFriends(json) { // <- you may or may not need to define parameters for your function
		let episodes = json["_embedded"].episodes;
		let cast = json["_embedded"].cast;
		let hasActorName = (elem) => elem.character.name.split(' ').shift();
		let actorName = cast.map((hasActorName));
		//I cannot belive this really works			
		let mappingJson = episodes.map((elem)=> {
			actorName.map((actor)=>{
				elem.name = elem.name.replace(actor,actor.toUpperCase());
				elem.summary = elem.summary.replace(actor,actor.toUpperCase());
			})
			return elem
		})
		return mappingJson
	}
})();
