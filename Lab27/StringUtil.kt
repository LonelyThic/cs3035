class StringUtil {
    fun concatenate(str1: String, str2: String): String {
        return str1 + str2
    }

    fun reverse(str: String): String {
        return str.reversed()
    }

    fun toUpperCase(str: String): String {
        return str.uppercase()
    }

    fun isEmpty(str: String): Boolean {
        return str.isEmpty()
    }
}

fun main() {
    val s = StringUtil()

    println(s.concatenate("Hello, ", "World!"))
    println(s.reverse("kotlin"))
    println(s.toUpperCase("lava dragon"))
    println(s.isEmpty(""))
}