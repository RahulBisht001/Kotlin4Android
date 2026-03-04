import java.util.Calendar

fun main() {

    /** Using if else as "Statement"
     *
     */
    val age = 19
    if (age >= 18) {
        println("Yes, you can vote!")
    } else {
        println("No, you can vote!")
    }

    /** using if else as "Expression"
     *
     * The last expression in a block is the value returned.
     */

    val yourAge = 14
    val message = if (yourAge >= 18) {
        "you're can drive"
    } else {
        "No, you can't drive"
    }
    println(message)

    /**
     * Kotlin have "when" which is an alternative (even better than switch) for switch
     */

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val dayIs = when (dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "???"
    }
    println(dayIs)

    /**
     * Matching Arbitrary Conditions (without an argument): Unlike switch
     * (which only works with a single value), when can evaluate arbitrary boolean expressions.
     * This makes it a great replacement for long if-else if-else chains.
     */
    val temperature = 25

    val weather = when { // No argument provided to 'when'
        temperature < 0 -> "Freezing"
        temperature in 0..10 -> "Cold"
        temperature in 11..20 -> "Cool"
        temperature in 21..30 -> "Warm"
        else -> "Hot"
    }
    println("The weather is $weather.")

    /**
     * Combining Multiple Conditions:
     * You can combine multiple values for a single branch using a comma.
     */

    val char = 'a'

    when (char) {
        'a', 'e', 'i', 'o', 'u' -> println("$char is a vowel.")
        in 'b'..'z' -> println("$char is a consonant.")
        else -> println("$char is not a letter.")
    }

    /**
     * Checking is and !is Types (Smart Casting):
     * when can check the type of a variable, and if it matches,
     * Kotlin's smart cast will automatically cast the variable to that type within the branch.
     */
    fun describe(obj: Any): String = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        is String -> "String of length ${obj.length}" // obj is smart-cast to String here
        else -> "Unknown"
    }

    println(describe(1))       // One
    println(describe("Hello")) // Greeting
    println(describe(1000L))   // Long
    println(describe("Kotlin"))// String of length 6
}