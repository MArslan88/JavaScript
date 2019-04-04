let myMultiplier = function(num1, num2){
    return num1*num2
}

let guestUser = function(name='unName', courseCount=0){ 
    //here name='unName' and courseCount=0 is "default parameters"
    return 'Hello '+ name + ' and your course count is '+ courseCount
}

//console.log(myMultiplier(3,5))

console.log(guestUser('Arslan'))