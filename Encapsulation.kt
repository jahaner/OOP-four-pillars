class BankAccount {
    private var balance: Int = 0

    fun deposit(amount: Int) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Int {
        return balance
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(1000)
    account.deposit(500)

    println("Balance: ${account.getBalance()}")
}
