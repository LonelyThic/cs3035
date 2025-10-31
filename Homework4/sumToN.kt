fun sumToN(n: Int): Int {
    if (n == 1) return 1

    return n + sumToN(n - 1)
}

fun main() {
    val n = 5
    println("Sum from 1 to $n is: ${sumToN(n)}")
}