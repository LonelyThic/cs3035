fun getDayOfWeek(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number! Please enter a number from 1 to 7."
    }
}

class Person(val name: String, val age: Int) {
    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Double {
        return if (b != 0) {
            a.toDouble() / b.toDouble()
        } else {
            println("Error: Division by zero is not allowed.")
            Double.NaN
        }
    }
}

fun main() {
    print("Enter a number (1-7) to get the day of the week: ")
    val dayNumber = readLine()?.toIntOrNull() ?: 0
    println("Day: ${getDayOfWeek(dayNumber)}")

    println("\n--- Person Example ---")
    val person = Person("Alice", 25)
    person.introduce()

    println("\n--- Basic Calculator Example ---")
    val calc = Calculator()
    val a = 10
    val b = 2
    println("Addition: $a + $b = ${calc.add(a, b)}")
    println("Subtraction: $a - $b = ${calc.subtract(a, b)}")
    println("Multiplication: $a * $b = ${calc.multiply(a, b)}")
    println("Division: $a / $b = ${calc.divide(a, b)}")

    println("Division by zero test: ${calc.divide(a, 0)}")
}