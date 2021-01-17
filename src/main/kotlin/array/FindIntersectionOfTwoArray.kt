package array

private fun getNumbersArrayOne(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Int array one is: ${numbers.contentToString()}")
    return numbers
}

private fun getNumbersArrayTwo(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Int array two is: ${numbers.contentToString()}")
    return numbers
}

private fun getSortedArrayOne(numbersArrayOne: IntArray): IntArray {
    val sortedNumberArrayOne = numbersArrayOne.sortedArray()
    println("Sorted Int array one is: ${sortedNumberArrayOne.contentToString()}")
    return sortedNumberArrayOne
}

private fun getSortedArrayTwo(numbersArrayTwo: IntArray): IntArray {
    val sortedNumberArrayTwo = numbersArrayTwo.sortedArray()
    println("Sorted Int array two is: ${sortedNumberArrayTwo.contentToString()}")
    return sortedNumberArrayTwo
}

fun findIntersection(sortedNumbersArrayOne: IntArray, sortedNumbersArrayTwo: IntArray) {
    var i = 0
    var j = 0
    val arrayOneSize = sortedNumbersArrayOne.size
    val arrayTwoSize = sortedNumbersArrayTwo.size
    while (i < arrayOneSize && j < arrayTwoSize) {
        when {
            sortedNumbersArrayOne[i] < sortedNumbersArrayTwo[j] -> {
                println("Now i is $i and element is ${sortedNumbersArrayOne[i]}")
                i++
            }
            sortedNumbersArrayTwo[j] < sortedNumbersArrayOne[i] -> {
                println("Now j is $j and element is ${sortedNumbersArrayTwo[j]}")
                j++
            }
            else -> {
                println(sortedNumbersArrayTwo[j++].toString() + " ")
                i++
            }
        }
    }
}

fun main() {
    val numbersArrayOne = getNumbersArrayOne()
    val numbersArrayTwo = getNumbersArrayTwo()
    val sortedNumbersArrayOne = getSortedArrayOne(numbersArrayOne)
    val sortedNumbersArrayTwo = getSortedArrayTwo(numbersArrayTwo)
    findIntersection(sortedNumbersArrayOne, sortedNumbersArrayTwo)
}
