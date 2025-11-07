class Rectangle(val width: Double, val height: Double) {

    fun area(): Double = width * height

    fun isSquare(): Boolean = width == height
}

fun main() {
    val rect = Rectangle(5.0, 5.0)
    println("Area: ${rect.area()}")
    println("Is square: ${rect.isSquare()}")