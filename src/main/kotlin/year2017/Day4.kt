package year2017

import Day
import util.getResource
import util.isAnagramOf

class Day4 : Day<Int> {
    private val input = processInput(getResource("2017/day4.txt")!!.readText())

    override fun part1(): Int {
        var validInputs = 0

        for (i in input) {
            if (i.toSet().size == i.size) {
                validInputs++
            }
        }

        return validInputs
    }

    override fun part2(): Int {
        var validInputs = 0

        outer@ for (i in input) {
            if (i.toSet().size != i.size) {
                continue
            }

            for (j in i.indices) {
                for (k in j + 1 until i.size) {
                    if (i[j].isAnagramOf(i[k])) {
                        continue@outer
                    }
                }
            }

            validInputs++
        }


        return validInputs
    }

    private fun processInput(input: String): List<List<String>> =
        input.split("\n")
            .map { it.split(" ")}
}