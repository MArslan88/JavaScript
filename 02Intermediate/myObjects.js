let myYoutubeVideoOne = {
    title: 'Loops in JavaScript',
    videoLength: 15,
    videoCreator: 'Muhammad Arslan',
    videoDescription: 'this is a video description and a long one'
}

let myYoutubeVideoTwo = {
    title: 'Functions in JavaScript',
    videoLength: 10,
    videoCreator: 'Muhammad Arslan',
    videoDescription: 'this is a video description and a long one'
}

//console.log(myYoutubeVideo);


//this will fetch the specific key values from the object like 'myYoutubeVideo.title' this will fetch only the title
//console.log(`Hey new Video on ${myYoutubeVideo.title} by ${myYoutubeVideo.videoCreator}`);

let changeVideoLength = function(myObject){
    return {
        formateOne: `Time of this video is: ${myObject.videoLength + 2}`,
        formateTwo: `Time of this video is: ${myObject.videoLength + 1}`
    }
}
let adOne =changeVideoLength(myYoutubeVideoTwo);
console.log(adOne.formateTwo);