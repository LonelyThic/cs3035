fun sumToN(n: Int): Int {
    if (n == 1) return 1
    return n + sumToN(n - 1)
}

fun main() {
    println("Sum from 1 to 5: ${sumToN(5)}")
}