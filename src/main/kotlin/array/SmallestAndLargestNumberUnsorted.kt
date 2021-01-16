package array

private fun getNumbersArray(): IntArray {
    print("Enter numbers (comma separated): ")
    val numbers = readLine()?.trim()?.split(',')?.map { it.toInt() }!!.toIntArray()
    println("Array of Int is: ${numbers.contentToString()}")
    return numbers
}

// Works for when -Int is expected
//fun findSmallestAndLargestNumber(numbers: IntArray) {
//    var smallest = 0
//    var largest = 0
//    for (number in numbers) {
//        if (number > largest) {
//            largest = number
//        } else if (number < smallest) {
//            smallest = number
//        }
//    }
//    println("Smallest number is: $smallest")
//    println("Largest number is: $largest")
//}

fun findSmallestAndLargestNumber(numbers: IntArray) {
    var smallest = numbers[0]
    var largest = numbers[0]
    for (number in numbers) {
        if (number > largest) {
            largest = number
        }
        if (number < smallest) {
            smallest = number
        }
    }
    println("Smallest number is: $smallest")
    println("Largest number is: $largest")
}

fun main() {
    val numbers = getNumbersArray()
    findSmallestAndLargestNumber(numbers)
}
