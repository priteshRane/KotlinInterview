package string.replace

private fun takeStringInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun enterStringToReplace(): String {
    print("Enter string to replace: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun enterStringToReplaceWith(): String {
    print("Enter string to replace with:")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun replaceString(enteredString: String, enteredStringToReplace: String, enterStringToReplaceWith: String) {
    val replaceString = enteredString.replace(enteredStringToReplace, enterStringToReplaceWith)
    println("Replaced string $replaceString")
}

fun main() {
    val enteredString = takeStringInputFromUser()
    val enteredStringToReplace = enterStringToReplace()
    val enterStringToReplaceWith = enterStringToReplaceWith()
    replaceString(enteredString, enteredStringToReplace, enterStringToReplaceWith)
}