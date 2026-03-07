fun main() {
    /**
     * Range and Progression
     *
     * 1. Ranges (The "Inclusive" Definition)
     * A Range is simply the mathematical definition of a set of values with a start and an end.
     * val range = 1..5 // Defines the set of numbers from 1 to 5 inclusive
     * A range by itself is just a mathematical boundary.
     * It doesn't inherently define how you move from the start to the end—it just
     * states that the values exist between those two points.
     *
     * 2. Progressions (The "How-to" Move)
     * A Progression is what actually allows you to iterate over a range.
     * A progression has a start, an end, and a step.
     * When you write 1..5, Kotlin implicitly creates an IntProgression.
     * Because you didn't specify a step, it defaults to step 1.
     *
     *
     */

    val range = 1..10
// A progression that skips numbers (step 2)
    val oddNumbers = 1..10 step 2
// A progression that counts backwards
    val countdown = 10 downTo 1 step 2
    println(countdown)
    println(countdown.toList())

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)

    val arr = arrayOf(1,2,3)
    println(arr.toList())

}

