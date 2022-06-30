package util

import Day

/**
 * Assuming that the String is a string of digits, converts said string to an Int List of said digits.
 */
fun String.toIntList(): List<Int> = toCharArray().map(Char::digitToInt).toList()

/**
 * Gets a file from the resources folder
 */
fun Day<Any>.getResource(path: String) = this::class.java.classLoader.getResource(path)

/**
 * Circles the given index so it is in bounds
 * Credit: tginsberg/cirkle
 */
fun <T> List<T>.circular(idx: Int): Int {
    if (idx < 0) {
        return (idx % size + size) % size
    }

    return idx % size
}