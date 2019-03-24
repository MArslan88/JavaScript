let iAmGlobal = 'someVale'

if(true){
    // let iAmLocal = 'someMoreValue'

    var iAmLocal = 'someMoreValue'  // this var will make iAmLocal as GLOBAL variable while its still
                                    // in the scope, so better practice is to not use var for decleration
    iAmGlobal = 'superman'
    console.log(iAmGlobal)
    console.log(iAmLocal)
}
console.log(iAmLocal)
console.log(iAmGlobal)