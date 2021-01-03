package array

import java.util.*

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()!!.trim().split(',').map { it.toInt() }.toIntArray()
    println("Int array is: ${numbers.contentToString()}")
    return numbers
}

private fun calculateSumOfCurrentNumbers(numbers: IntArray) : Int {
    val numbersSum = numbers.sum()
    println("Sum of current Int array is: $numbersSum")
    return numbersSum
}

private fun calculateSumOfActualNumbers(actualSizeOfNumberArray: Int): Int {
    // Formula: n*(n + 1) / 2
    val numberSum = actualSizeOfNumberArray * (actualSizeOfNumberArray + 1) / 2
    println("Sum of actual Int array is: $numberSum")
    return numberSum
}

fun main() {
    val numbers = getNumbersArray()
    val currentSizeOfNumberArray = numbers.size
    val actualSizeOfNumberArray = currentSizeOfNumberArray + 1
    val currentNumbersSum = calculateSumOfCurrentNumbers(numbers)
    val actualNumberSum = calculateSumOfActualNumbers(actualSizeOfNumberArray)
    val missingNumberIs = actualNumberSum - currentNumbersSum
    println("Missing number is: $missingNumberIs")
}