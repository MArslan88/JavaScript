
let result = function(gainMarks,totalMarks){
    let percentage = (gainMarks/totalMarks) * 100
    let myGrade = ''

    if(percentage>=80){
        myGrade = 'A+'
    }else if(percentage>=70){
        myGrade = 'A'
    }else if(percentage>=60){
        myGrade = 'B'
    }else if(percentage>=50){
        myGrade = 'C'
    }else{
        console.log('you are Fail, give test again')
    }
    return `Your grade is ${myGrade} and percentage is ${percentage}`
}
let yourResult = result (79,100)
console.log(yourResult)