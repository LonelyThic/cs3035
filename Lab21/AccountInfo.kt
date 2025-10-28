fun main() {
    println("=== Account Balance and PIN ===")
    print("Enter your account balance: ")
    var accountBalance = readLine()!!.toDouble()

    print("Enter your 4-digit PIN code: ")
    val pinCode = readLine()!!

    println("Your account balance is $$accountBalance and your PIN code is $pinCode.")
}