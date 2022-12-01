
fun main() {
    val input = readInput("day_01")

    val sumByGroup = input.chunkedBy { it.isBlank() }.map{ caloriesByElf -> caloriesByElf.sumOf { it.toInt() } }

    fun part1(): Int = sumByGroup.max()

    fun part2(): Int = sumByGroup.sortedDescending()
        .take(3)
        .sum()

    println(part1())
    println(part2())

}
