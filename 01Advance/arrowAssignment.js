let todos = [{
    title: 'Buy bread',
    isDone: true,
} ,{
    title: 'Go to gym',
    isDone: true,
} ,{
    title: 'Record youtube video',
    isDone: false,
},{
    title: 'Buy electronic items',
    isDone: true,
} ,{
    title: 'Go to park',
    isDone: false,
} ,{
    title: 'Record video lectures',
    isDone: false,
}]


// const thingsNotDone = todos.filter((todo) => {
//         return todo.isDone === false
//     })
//     console.log(thingsNotDone);


    // const thingsNotDone = todos.filter((todo) => todo.isDone === false)
// console.log(thingsNotDone)

const notDoneFunction = (newTodo) => {
    let ans=newTodo.filter((todo) => todo.isDone === false)
    ans.forEach((todo) =>{
        console.log(todo.title);
    });
}

notDoneFunction(todos)
