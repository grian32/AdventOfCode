package year2017

import Day
import util.circular
import util.getResource
import util.toIntList


class Day1 : Day<Int> {
    private val input = getResource("2017/day1.txt")!!.readText().toIntList()

    override fun part1(): Int {
        var sum = 0

        for (i in input.indices) {
            val nextIndex = if (i == input.size - 1) 0 else i + 1
            if (input[i] == input[nextIndex]) {
                sum += input[i]
            }
        }

        return sum
    }

    override fun part2(): Int {
        var sum = 0
        val stepsForward = input.size / 2

        for (i in input.indices) {
            val nextIndex = if (i + stepsForward >= input.size) input.circular(i + stepsForward) else i + stepsForward
            if (input[i] == input[nextIndex]) {
                sum += input[i]
            }
        }

        return sum
    }
}