fun main() {
    println("=== String Length ===")
    print("Enter a string: ")
    val inputString = readLine()!!

    println("The length of your string is ${getStringLength(inputString)}.")
}

fun getStringLength(input: String): Int {
    return input.length
}