fun main() {
    println("=== Even or Odd ===")
    print("Enter a number: ")
    val number = readLine()!!.toInt()

    println("The number $number is ${isEvenOrOdd(number)}.")
}

fun isEvenOrOdd(number: Int): String {
    return if (number % 2 == 0) "Even" else "Odd"
}