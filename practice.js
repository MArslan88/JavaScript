const dog = {
    name: 'Jodi',
    age: 7,
    whatIsThis: function() {
        console.log(this);
    },
    woof: function() {
        console.log(this.name +" Says 'woof!'");
    },
    ageOneYear: function(){
        this.age +=1;
        console.log('Current age: '+ this.age);
    }
};
