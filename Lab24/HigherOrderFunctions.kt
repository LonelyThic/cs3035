import kotlin.math.pow

fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun mathOperation(operation: (Int, Int) -> Int): (Int, Int) -> Int {
    return operation
}

fun main() {
    println("Part 1: Function as Input Argument")

    val a = 5
    val b = 3

    println("Addition: ${mathOperation(a, b, ::add)}")
    println("Subtraction: ${mathOperation(a, b, ::subtract)}")
    println("Multiplication: ${mathOperation(a, b, ::multiply)}")

    println("Power (Lambda): ${mathOperation(a, b) { x, y -> x.toDouble().pow(y).toInt() }}")

    println("\nPart 2: Returning a Function")

    val addFunction = mathOperation(::add)
    val subtractFunction = mathOperation(::subtract)
    val multiplyFunction = mathOperation(::multiply)

    println("Add function result: ${addFunction(5, 3)}")
    println("Subtract function result: ${subtractFunction(10, 6)}")
    println("Multiply function result: ${multiplyFunction(4, 7)}")
}