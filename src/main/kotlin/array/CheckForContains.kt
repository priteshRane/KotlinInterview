package array

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers: IntArray = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Int array is: ${numbers.contentToString()}")
    return numbers
}

private fun getNumberToFind(): Int {
    print("Enter number to Find: ")
    val number = readLine()?.toInt()
    println("Entered number is: $number")
    return number!!.toInt()
}

fun checkForNumberContains(numbersArray: IntArray, numberToFind: Int) {
    if (numbersArray.contains(numberToFind)) println("Number contain in Array") else println("Number does not contain in Array")
}

fun main() {
    val numbersArray = getNumbersArray()
    val numberToFind = getNumberToFind()
    checkForNumberContains(numbersArray, numberToFind)
}
