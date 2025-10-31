fun isPalindrome(s: String): Boolean = s == s.reversed()

fun main() {
    println("racecar → ${isPalindrome("racecar")}")
    println("hello → ${isPalindrome("hello")}")
}