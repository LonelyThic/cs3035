fun isPalindrome(str: String): Boolean = str == str.reversed()

fun main() {
    println(isPalindrome("racecar"))
    println(isPalindrome("hello"))
}