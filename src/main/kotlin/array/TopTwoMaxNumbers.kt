package array

private fun findTopTwoMaxNumbers(numbers: Array<Int>) {
    val sortedArray = numbers.sortedArray()
    sortedArray.forEach { print("$it ") }
    println()
    println("First top maximum number: ${sortedArray[sortedArray.size - 1]}")
    println("Second top maximum number: ${sortedArray[sortedArray.size - 2]}")
}

fun main() {
    print("Enter numbers (space separated): ")
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toTypedArray()
    findTopTwoMaxNumbers(numbers)
}