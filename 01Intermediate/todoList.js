const myTodos = []

myTodos.push('Buy Bread')
myTodos.push('Record videos for youtube')
myTodos.push('Go to Gym')

// myTodos.forEach(function(todo, index){
//     console.log(`your task no. ${index} is: ${todo}`);

// })


for (let index = 0; index < myTodos.length; index++) {
    console.log(`your task no. ${index+1} is: ${myTodos[index]}`);
    
    
}