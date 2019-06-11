// const sayHello = function(name){
//     return "Hey there, " + name + " !"
// }

// console.log(sayHello('Arslan'));




//  in arrow function, we remove word 'function' and use '=>' after arguments
// const sayHello = (name) => {
//     return `Hey there ${name} !`
// }

// console.log(sayHello('Arslan'));




const sayHello = (name) => `Hey there ${name} !` //if we have single line to return then don't use big block of code
                                                // we can also remove the function brackets and use within the same line

console.log(sayHello('Arslan'));





const todos = [{
    title: 'Buy bread',
    isDone: true,
} ,{
    title: 'Go to gym',
    isDone: true,
} ,{
    title: 'Record youtube video',
    isDone: false,
}]

// const thingsDone = todos.filter((todo) => {
//     return todo.isDone === true
// })
// console.log(thingsDone);

const thingsDone = todos.filter((todo) => todo.isDone === true)
console.log(thingsDone)
