fun reverseString(str: String): String {
    if (str.length <= 1) return str
    return reverseString(str.substring(1)) + str[0]
}

fun main() {
    println(reverseString("hello"))
    println(reverseString("kotlin"))
}