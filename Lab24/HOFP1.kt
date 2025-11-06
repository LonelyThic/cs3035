fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println("Part 1 Tests")
    println("Add: " + mathOperation(5, 3, ::add))
    println("Subtract: " + mathOperation(5, 3, ::subtract))
    println("Multiply: " + mathOperation(5, 3, ::multiply))
}