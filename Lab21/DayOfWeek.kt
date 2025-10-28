fun main() {
    println("=== Get Day of the Week ===")
    print("Enter a number from 1 to 7: ")
    val dayNumber = readLine()!!.toInt()

    println("The day is ${getDayOfWeek(dayNumber)}.")
}

fun getDayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid input. Please enter a number between 1 and 7."
    }
}