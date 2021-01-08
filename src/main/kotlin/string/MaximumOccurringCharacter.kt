package string

private fun takeInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun takeCharToCheckMaximumOccurring(): String {
    print("Enter character to remove: ")
    val charToRemove = readLine()
    if (!charToRemove.isNullOrEmpty()) {
        println("Character entered is $charToRemove")
        return charToRemove
    }
    return "No character entered"
}

fun checkMaximumOccurringCharacter(enteredString: String, enteredCharacter: String) {
    val countOfOccurrenceIs = enteredString.count { it == enteredCharacter.toCharArray()[0]  }
    println(countOfOccurrenceIs)
}

fun main() {
    val enteredSting = takeInputFromUser()
    val enteredCharacter = takeCharToCheckMaximumOccurring()
    checkMaximumOccurringCharacter(enteredSting, enteredCharacter)
}
