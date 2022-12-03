fun main() {
    val input = readInput("day_02")

    fun part2(it: String): Int {
        val (playerOneInput, playerTwoInput) = it.split(" ")
        when {
            playerTwoInput.equals("X") -> when {
                playerOneInput.equals("A") ->return 3
                playerOneInput.equals("B") ->return 1
                playerOneInput.equals("C") ->return 2
            }
            playerTwoInput.equals("Y") -> when {
                playerOneInput.equals("A") ->return 4
                playerOneInput.equals("B") ->return 5
                playerOneInput.equals("C") ->return 6
            }
            else -> when {
                playerOneInput.equals("A") ->return 8
                playerOneInput.equals("B") ->return 9
                playerOneInput.equals("C") ->return 7
            }
        }
        return 0
    }


    fun part1(it: String): Int {

        val (playerOneInput, playerTwoInput) = it.split(" ")
        when {
            isPlayerOneWInner(playerOneInput, playerTwoInput) -> {
                when {
                    playerTwoInput.equals("X") -> return 1
                    playerTwoInput.equals("Y") -> return 2
                    playerTwoInput.equals("Z") -> return 3
                }
            }
            isPlayerTwoWInner(playerTwoInput, playerOneInput) -> {

                when {
                    playerTwoInput.equals("X") ->return 7
                    playerTwoInput.equals("Y") ->return 8
                    playerTwoInput.equals("Z") ->return 9
                }

            }
            else -> {
                when {
                    playerTwoInput.equals("X") ->return 4
                    playerTwoInput.equals("Y") ->return 5
                    playerTwoInput.equals("Z") ->return 6
                }
            }
        }
        return 0
    }


    val matchList = input.map { part1(it) }.sum()
    val matchList2 = input.map { part2(it) }.sum()
    println(matchList)
    println(matchList2)
}

fun isPlayerOneWInner(playerOneInput: String, playerTwoInput: String): Boolean =
    (playerOneInput == "A" && playerTwoInput == "Z") ||
            (playerOneInput == "B" && playerTwoInput == "X") ||
            (playerOneInput == "C" && playerTwoInput == "Y")

fun isPlayerTwoWInner(playerTwoInput: String, playerOneInput: String): Boolean =
    (playerTwoInput == "X" && playerOneInput == "C") ||
            (playerTwoInput == "Y" && playerOneInput == "A") ||
            (playerTwoInput == "Z" && playerOneInput == "B")

