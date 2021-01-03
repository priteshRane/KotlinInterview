package string.palindrome

import java.lang.StringBuilder

/*
Palindrome:
Whose reverse is equal to the original
  */

private fun takeInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun chooseMethod(): Int {
    print("Select method 1 for MethodOne, 2 for MethodTwo: ")
    val enteredMethod = readLine()?.toInt()
    if (enteredMethod != null) {
        if (enteredMethod < 1 || enteredMethod > 2) {
            println("Method selected is $enteredMethod")
            return enteredMethod
        }
    }
    return 1
}

private fun isPalindromeStringMethodOne(text: String) {
    val sb: StringBuilder = StringBuilder(text).reverse()
    val reverseString: String = sb.toString()
    if (text == reverseString) {
        println("$text is Palindrome")
    } else {
        println("$text is not Palindrome")
    }
}

private fun isPalindromeStringMethodTwo(text: String) {
    val sb = StringBuilder(text.length)
    val charArray: CharArray = text.toCharArray()
    val newCharArray: CharArray = charArray.reversedArray()
    for (i in newCharArray) {
        sb.append(i)
    }
    val reverseString: String = sb.toString()
    if (text == reverseString) {
        println("$text is Palindrome")
    } else {
        println("$text is not Palindrome")
    }
}

fun main() {
    val enteredString = takeInputFromUser()
    val enteredMethod = chooseMethod()

    when(enteredMethod) {
        1 -> isPalindromeStringMethodOne(enteredString)
        2 -> isPalindromeStringMethodTwo(enteredString)
    }
}