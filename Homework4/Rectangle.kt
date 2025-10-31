class Rectangle(val width: Double, val height: Double) {

    fun area(): Double {
        return width * height
    }

    fun isSquare(): Boolean {
        return width == height
    }
}

fun main() {
    val rect1 = Rectangle(4.0, 5.0)
    val rect2 = Rectangle(6.0, 6.0)

    println("Rectangle 1: area = ${rect1.area()}, isSquare = ${rect1.isSquare()}")
    println("Rectangle 2: area = ${rect2.area()}, isSquare = ${rect2.isSquare()}")
}