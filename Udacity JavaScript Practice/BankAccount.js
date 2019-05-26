/*
 * Programming Quiz: Bank Accounts 1 (7-3)
 */

var savingsAccount = {
    balance: 1000,
    interestRatePercent: 1,
    deposit: function addMoney(amount) {
        if (amount > 0) {
            savingsAccount.balance += amount;
        }
    },
    withdraw: function removeMoney(amount) {
        var verifyBalance = savingsAccount.balance - amount;
        if (amount > 0 && verifyBalance >= 0) {
            savingsAccount.balance -= amount;
        }
    },
    // Bacnk Account Summary 
    print: function printAccountSummary(){
        console.log("Welcome!");
        console.log(`Your Balance is currently ${savingAccount.balance} 
                and your interest rate is ${savingAccount.interestRatePercent}`);
    }
    
};

console.log(savingsAccount.print());