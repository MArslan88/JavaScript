let myTodos={
    day: 'Monday',
    meetings: 0,
    meetDone: 0,
}

let addMeeting = function (todo, meet = 0){
    todo.meetings = todo.meetings + meet;
}

let meetDone = function(todo,meet=0){
    todo.meetDone = todo.meetDone - meet;
}

let resetDay = function(todo){
    todo.meetings = 0;
    todo.meetDone = 0;
}

let getSummaryOfDay = function(todo){
    let meetLeft = todo.meetings + todo.meetDone; // because here it will be 0-5 = -5 and -(-5) will be +5 so to overcome this we will use +ve sign to subtract the value
    return `You have ${meetLeft} meetings today!`
}

addMeeting(myTodos, 4);
addMeeting(myTodos,2);
meetDone(myTodos,5)

console.log(myTodos) // this will shows the -5 value which is discussed above.

console.log(getSummaryOfDay(myTodos));