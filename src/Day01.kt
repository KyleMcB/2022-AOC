import kotlin.math.max

fun main() {
    val input = readInput("Day01")
    println("solution to puzzle 1 ${solution1(input)}")
    println("solution to puzzle 2 ${solution2(input)}")
}

// list of numbers with an extra new line to seperate groups
// I need to sum the groups and find the greatest
fun solution1(input: List<String>): Int {
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
} // I decided to go for a semi functional approach

//I need to keep track of the top three this time so I will just keep track of all of them
//then sort and take the top three
fun solution2(input: List<String>):Int {
    val list = mutableListOf<Int>()
    input.fold(0) {acc: Int, s: String ->
        if (s.isBlank()) {
            list.add(acc)
            0
        } else {
            acc + s.toInt()
        }
    }
    list.sort()
    val last = list.lastIndex
    return list[last] + list[last-1] + list[last-2]
}