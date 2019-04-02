const numbers = ['one','two','three','four','five','six']


//start of an array
// console.log(numbers.shift())   // it will delete the first index value

// console.log(numbers.unshift('something'))   // it will add the new value at the first index
// console.log(numbers)


// middle of an array

//The zero-based location in the array from which to start removing elements.
//Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
numbers.splice(2,2,'someThing')   //numbers.splice(indexFrom,toIndexTill,'newValueYouWantToAdd')
console.log(numbers)


// end of an array
// numbers.pop();  // Removes the last element from an array and returns it

// numbers.push('Eleven')   //Appends new elements at the end of an array, and returns the new length of the array
// console.log(numbers)
