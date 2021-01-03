package array

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers = readLine()!!.trim().split(',').map { it.toInt() }.toIntArray()
    println("Array of Int is: ${numbers.contentToString()}")
    return numbers
}

private fun isDuplicateNumberInArray(numbers: IntArray): Boolean {
    if (numbers.size == numbers.distinct().count()) {
        println("No, There is no duplicate number")
        return false
    }
    println("Yes, There is duplicate number")
    return true
}

private fun findDuplicateNumber(numbers: IntArray): Int {
    for (i in numbers.indices) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] == numbers[j]) {
                println("Duplicate number is: ${numbers[i]}")
                return numbers[i]
            }
        }
    }
    return 0
}

private fun removeDuplicateNumber(numbers: IntArray): IntArray {
    val distinctIntArray = numbers.distinct().toIntArray()
    println("Distinct int array: ${distinctIntArray.contentToString()}")
    return distinctIntArray
}

fun main() {
    val numbers = getNumbersArray()
    if (isDuplicateNumberInArray(numbers))
        findDuplicateNumber(numbers)
    removeDuplicateNumber(numbers)
}