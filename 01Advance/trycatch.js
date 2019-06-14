const convertToRs = (dollar) => {
    if (typeof dollar === 'number') {
        return dollar * 64
    }else {
        throw Error('Amount needs to be in number')
    }
}

// const myValue = convertToRs('five')
//     console.log(myValue);

try {
    const myValue = convertToRs('five')
    console.log(myValue);
    
} catch (error) {
    console.log(error);
    
}

// with the use of trycatch this line will also be run whether program will crash or not, 
console.log('i will not run if program crashes');



