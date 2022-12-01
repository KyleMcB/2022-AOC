import kotlin.math.max

fun main() {
    val input = readInput("Day01")
    solution(input)
}

// list of numbers with an extra new line to seperate groups
// I need to sum the groups and find the greatest
fun solution(input: List<String>): Int {
    var maxValueSoFar = Int.MIN_VALUE
    input.fold(0) { acc: Int, s: String ->
        if (s.isBlank()) {
            maxValueSoFar = max(maxValueSoFar, acc)
            0
        } else {
            acc + s.toInt()
        }
    }
    return maxValueSoFar
}
// I decided to go for a semi functional approach