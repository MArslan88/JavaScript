let userEmail = 'abc@hotmail.com'
let password = '1234567'

let userChecker = function(myString){
    if((myString.includes('@')) && (myString.length >6)){
        console.log('Please set your password');
    }else{
        console.log('Please check your user name or email id')
    }    
}

let passChecker = function(pass){
    if((pass.includes(1234)) && (pass.length >6)){
        console.log('Signing up...!');
    }else{
        console.log('This is weak password, please make your password strong...!')
    }
}

userChecker(userEmail);
passChecker(password);
