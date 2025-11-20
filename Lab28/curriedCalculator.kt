class curriedCalculator {

    fun add(a: Int): (Int) -> Int {
        return { b -> a + b }
    }
    fun multiply(a: Int): (Int) -> Int {
        return { b -> a * b }
    }

    fun power(a: Int): (Int) -> Int {
        return { b -> Math.pow(b.toDouble(), a.toDouble()).toInt() }
    }

    fun equationSolver(a: Int, b: Int, c: Int): Int {
        val pow2 = power(2)
        val squareC = pow2(c)

        val multB = multiply(b)
        val bTimesC2 = multB(squareC)

        val addA = add(a)
        return addA(bTimesC2)
    }
}

fun main() {
    val calculator = curriedCalculator()

    val add100 = calculator.add(100)
    println(add100(20))

    val mult10 = calculator.multiply(10)
    println(mult10(20))

    val pow2 = calculator.power(2)
    println(pow2(10))

    println(calculator.equationSolver(2, 3, 4))
}