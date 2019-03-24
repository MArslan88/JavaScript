// $$ - AND operator - Both sides need to be true
// || - OR operation - One side need to be true


var isVerified = true
var isLoggedIn = true
var hasPaymentToke = true
var isGuest = true

if(isVerified && isLoggedIn && hasPaymentToke){
    console.log('Greeting message to user')
    console.log('Grand access to paid course')
} else if (isVerified || isGuest){
    console.log('Allow free previews')
}else{
    console.log('MESSAGE: please contact admin')
}