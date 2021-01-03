package array

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers = readLine()!!.trim().split(',').map { it.toInt() }.toIntArray()
    println("Array of Int is: ${numbers.contentToString()}")
    return numbers
}

private fun sortNumbersArray(numbers: IntArray): IntArray {
    val sortedNumbersArray: IntArray = numbers.sorted().toIntArray()
    println("Sorted Int array is: ${sortedNumbersArray.contentToString()}")
    return sortedNumbersArray
}

private fun smallestNumberIs(numbers: IntArray) {
    val smallestNumber = numbers.first()
    println("Smallest number is: $smallestNumber")
}

private fun largestNumberIs(numbers: IntArray) {
    val largestNumber = numbers.last()
    println("Largest number is: $largestNumber")
}

fun main() {
    val numbers = getNumbersArray()
    val sortedNumbers = sortNumbersArray(numbers)
    smallestNumberIs(sortedNumbers)
    largestNumberIs(sortedNumbers)
}