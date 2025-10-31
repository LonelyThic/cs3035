fun reverseString(s: String): String {
    if (s.length <= 1) return s

    return s.last() + reverseString(s.substring(0, s.length - 1))
}

fun main() {
    val text1 = "hello"
    val text2 = "kotlin"

    println("Reversed '$text1' → '${reverseString(text1)}'")
    println("Reversed '$text2' → '${reverseString(text2)}'")
}