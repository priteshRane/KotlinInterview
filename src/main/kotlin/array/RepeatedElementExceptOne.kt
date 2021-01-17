package array

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Int array is: ${numbers.contentToString()}")
    return numbers
}

fun getSortedNumbersArray(numbersArray: IntArray): IntArray {
    val sortedNumberArray = numbersArray.sortedArray()
    println("Sorted Int Array is: ${sortedNumberArray.contentToString()}")
    return sortedNumberArray
}

fun checkForRepeatedNumbers(sortedNumbersArray: IntArray) : Boolean {
    if (sortedNumbersArray.distinct().count() > 0) return true
    return false
}

fun findRepeatedElementExceptOne(sortedNumbersArray: IntArray) {
    val duplicateNumbers = mutableListOf<Int>()
    for (i in sortedNumbersArray.indices) {
        for (j in i + 1 until sortedNumbersArray.size) {
            if (sortedNumbersArray[i] != 1) {
                if (sortedNumbersArray[i] == sortedNumbersArray[j]) {
                    duplicateNumbers.add(sortedNumbersArray[i])
                }
            }
        }
    }

    println("Duplicate number except 1 is: $duplicateNumbers")
}

fun main() {
    val numbersArray = getNumbersArray()
    val sortedNumbersArray = getSortedNumbersArray(numbersArray)
    if (checkForRepeatedNumbers(sortedNumbersArray))
        findRepeatedElementExceptOne(sortedNumbersArray)
}
