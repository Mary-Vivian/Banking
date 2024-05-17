fun main(args: Array<String>) {
var account=Account("10453377373")
    account.checkbalance()
    account.deposit(5000.00)
    account.withdraw(40000.00)

}
var balance=70000.00
class Account(var accountnumber:String ){
    fun checkbalance(){
    println("Your balance is $balance")
    }
    fun deposit(amount:Double){
        balance+=amount
        println("You have deposited $amount and your balance is $balance")

    }
    fun withdraw(amountwithdraw:Double){
        if(amountwithdraw>balance){
            println("Insufficient balance please topUp your current balance is $balance")
        }
        else{
            balance-=amountwithdraw
            println("you have successfully withdrawn $amountwithdraw and your current balance is $balance")
        }

    }

}