// prompt will show the prompt on the browser
var num1 = prompt("Enter 1st Number");
//var num2 = prompt("Enter 2nd Number");
//var ans = parseInt(num1) + parseInt(num2)
// var ans = Number(num1) + Number(num2)  we can also use Number instead of parseInt

//alert ("Sum of 2 numbers : "+ans);

var convertedNumber = Number(num1);
if(convertedNumber !== NaN){
    alert("Valid data type")
}else{
    alert("Enter a valid data type value!")
}