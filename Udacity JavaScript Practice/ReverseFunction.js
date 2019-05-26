// function reverses the order of characters in a word
function reverseString(reverseMe){
    var reversed="";
    // loops over the characters in reverse order
    for (var i = reverseMe.length-1; i>=0; i--){
        // adds characters to a new word
        reversed+= reverseMe[i];        
    }
    return reversed;
}
console.log(reverseString("Arslan"));