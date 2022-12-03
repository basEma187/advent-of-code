fun main() {
    val input = readInput("day_01")

    val sumByGroup = input.chunkedBy { it.isBlank() }.map{ caloriesByElf -> caloriesByElf.sumOf { it.toInt() } }

    fun p1(): Int {
        var t =0;
        var result =0;
        input.forEach{
            if (it.isEmpty()){
                if (result < t)
                    result = t
                t = 0
            } else
                t += it.toInt()
        }
        return result
    }

    fun part1(): Int = sumByGroup.max()

    fun part2(): Int = sumByGroup.sortedDescending()
        .take(3)
        .sum()

    println(p1())
    println(part1())
    println(part2())
}
