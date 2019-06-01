let numOne = 22;
let numTwo = 7;

result = numOne/numTwo;

// console.log(result.toFixed(2));;
// let floatRes = result.toFixed(2);

// console.log(Math.floor(floatRes)); // it will round of the value to the lowest range
// console.log(Math.ceil(floatRes)); // it will round of the value to the highest range

// console.log(Math.random()* 5 + 1) //this will generate random number and multiply these with 5+1

let upper = 6;
let lower = 1;

let myRandom = Math.floor(Math.random() * (upper - lower + 1))+lower;  // this will generate the random number between 1 and 6

console.log(myRandom)