import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val maxValue = { numbers: List<Int> -> numbers.max() }

    val squares = { numbers: List<Int> -> numbers.map { it * it } }

    val sumOfSquares = { numbers: List<Int> -> numbers.map { it * it }.sum() }

    val average = { numbers: List<Int> ->
        if (numbers.isNotEmpty()) numbers.sum().toDouble() / numbers.size else 0.0
    }

    val circleArea = { r: Double -> PI * r.pow(2) }

    val filterWithA = { words: List<String> -> words.filter { "a" in it } }

    val fToC = { f: Double -> (f - 32) * 5 / 9 }

    val numbers = listOf(3, 7, 2, 9, 4)
    val words = listOf("apple", "pear", "grape", "melon", "berry")

    println("1. Max value: ${maxValue(numbers)}")
    println("2. Squares: ${squares(numbers)}")
    println("3. Sum of squares: ${sumOfSquares(numbers)}")
    println("4. Average: ${average(numbers)}")
    println("5. Circle area (r=5): ${circleArea(5.0)}")
    println("6. Filter words with 'a': ${filterWithA(words)}")
    println("7. 98°F in Celsius: ${fToC(98.0)}")
}