package string.removecharacter

import java.lang.StringBuilder

private fun takeInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun takeCharToRemove(): String {
    print("Enter character to remove: ")
    val charToRemove = readLine()
    if (!charToRemove.isNullOrEmpty()) {
        println("Character entered is $charToRemove")
        return charToRemove
    }
    return "No character entered"
}

private fun remove(word: String, ch: String): String {
    val sb = StringBuilder()
    val charArray: CharArray = word.toCharArray()
    for (c in charArray) {
        if (c.toString() != ch) {
            sb.append(c)
        }
    }
    return sb.toString()
}

fun main() {
    val enteredString = takeInputFromUser()
    val charToRemove = takeCharToRemove()
    println("String after removing character $charToRemove is: ${remove(enteredString, charToRemove)}")
}