package array

import java.util.HashSet

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Int array is: ${numbers.contentToString()}")
    return numbers
}

private fun getNumber(): Int {
    print("Enter number: ")
    val number = readLine()?.toInt()
    println("Entered number is: $number")
    return number!!.toInt()
}

fun findPairOfSumEqualsGivenNumber(numbers: IntArray, number: Int) {
    val set = HashSet<Int>(numbers.size)

    println("Target || Number || Value")
    for (value in numbers) {
        val target: Int = number - value

        if (!set.contains(target)) {
            set.add(value)
            println("$target    ||    $number     ||     $value")
        } else {
            println("$target    ||    $number     ||     ($value, $target)")
        }
    }
}

fun main() {
    val numbers = getNumbersArray()
    val number= getNumber()
    findPairOfSumEqualsGivenNumber(numbers, number)
}
