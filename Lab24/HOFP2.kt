fun add(a: Int, b: Int): Int = a + b
fun subtract(a: Int, b: Int): Int = a - b
fun multiply(a: Int, b: Int): Int = a * b

fun mathOperation(operation: (Int, Int) -> Int): (Int, Int) -> Int {
    return operation
}

fun main() {
    println("Part 2 Tests")
    val addFunction = mathOperation(::add)
    val resultAdd = addFunction(5, 3)
    println("Returned add function result: $resultAdd")
}