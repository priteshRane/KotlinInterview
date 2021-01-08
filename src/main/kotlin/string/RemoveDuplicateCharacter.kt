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

private fun removeDuplicateCharacters(enteredString: String) {
    val removeDuplicateCharacters = enteredString.toCharArray().distinct().joinToString("")
    println("String after removing duplicates: $removeDuplicateCharacters")
}

fun main() {
    val enteredSting = takeInputFromUser()
    removeDuplicateCharacters(enteredSting)
}