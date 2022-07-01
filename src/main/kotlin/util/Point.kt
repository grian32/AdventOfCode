package util

import kotlin.math.abs

data class Point(var x: Int, var y: Int) {
    fun manhattanDistance(other: Point): Int = abs(x - other.x) + abs(y - other.y)
}