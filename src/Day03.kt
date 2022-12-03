fun main() {
    val input = readInput("day_03")
    var result1 = 0;
    var result2 = 0;

    fun count1(first: String, it: Char) {
        when {
            first.contains(it) -> {
                result1 += when {
                    it.code <= 90 -> {
                        it.code - 38
                    }
                    else -> {
                        it.code - 96
                    }
                }
            }
        }
    }

    fun partOne(it: String): Int {
        val list = it.chunked(it.length / 2)
        list[0].toList().distinct().forEach { count1(list.first(), it) }
        return result1
    }

    fun count2(group: List<String>) {
        group.first().toList().distinct().forEach{
            when {
                group.get(1).contains(it) && group.last().contains(it) -> {
                    when {
                        it.code <= 90 -> {
                            result2 += it.code - 38
                        }
                        else -> {
                            result2 += it.code - 96
                        }
                    }
                }
            }
        }

    }

    fun partTwo(){
        input.chunked(3).map{group->count2(group)}
    }

    input.map { partOne(it) }
    partTwo()

    println(result1)
    println(result2)

}






