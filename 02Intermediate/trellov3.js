let myTodos={
    day: 'Monday',
    meetings: 0,
    done: 0,

    // functions inside the object is called Method otherwise it is called Functions, but technically both are same ...
    addMeeting: function(num){
        this.meetings = this.meetings + num;  // 'this' will reffer to the refference of the present object like 'myTodos'
    },
    meetDone: function(meet=0) {
        this.done = this.done + meet;
    },
    resetDay: function(){
        this.meetings = 0;
        this.meetDone = 0;
    },
    summary: function(){
        let leftmeetings = this.meetings - this.done;
        return `You have ${leftmeetings} meetings today!`
    }
}

myTodos.addMeeting(5);
myTodos.meetDone(3);
console.log(myTodos.summary());
