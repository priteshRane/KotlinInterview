package string.removecharacter

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

private fun removeRecursive(word: String, ch: String) : String {
    val index = word.indexOf(ch)
    if (index == -1) {
        return word
    }
    println("=== Steps ===")
    println("word.substring(0, index): ${word.substring(0, index)}, word.substring(index + 1, word.length): ${word.substring(index + 1, word.length)}, ch: $ch")
    return removeRecursive(word.substring(0, index) + word.substring(index + 1, word.length), ch)
}

fun main() {
    val enteredString = takeInputFromUser()
    val charToRemove = takeCharToRemove()
    println("String after removing character $charToRemove is ${removeRecursive(enteredString, charToRemove)}")
}