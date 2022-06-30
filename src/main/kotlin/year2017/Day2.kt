package year2017

import Day
import util.getResource

class Day2 : Day<Int> {
    private val input = processInput(getResource("2017/day2.txt")!!.readText())

    override fun part1(): Int {
        var sum = 0

        for (i in input) {
            sum += (i.maxOrNull() ?: 0) - (i.minOrNull() ?: 0 )
        }

        return sum
    }

    override fun part2(): Int {
        var sum = 0

        for (i in input) {
            for (j in i) {
                for (k in i) {
                    if (j.toDouble() / k.toDouble() % 1 == 0.0) {
                        if (j / k == 1) continue
                        sum += j / k
                    }
                }
            }
        }

        return sum
    }

    private fun processInput(input: String): List<List<Int>> =
        input.split("\n")
            .map { it.split(Regex("\\W+")) }
            .map { it.map(String::trim).map(String::toInt) }
}