// var umbell = {
//     color: "pink",
//     isOpen: false,
//     open: function(){
//         if (umbell.isOpen === true){
//             return "The umbrella is already opened!";
//         }else {
//             umbell.isOpen = true;
//             return "Julia opens the umbrella";
//         }
//     }   
// };
// console.log(umbell.isOpen);


var person ={
    name: "Jhon",
    age: 55,
    children:["James", "Jarrod", "Alexis"]
};

var garage ={
    "fireTruck": {
        "Color": "Red",
        "Wheels":6,
        "operational":true
    },
    "raceCar":{
        "color": "blue",
        "wheels":4,
        "operational":false
    }
};
console.log(garage.raceCar.color) //first method
console.log(garage.raceCar["color"]) //second method