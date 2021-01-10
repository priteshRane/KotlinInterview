package string.reverse

private fun takeInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun createWordsList(enteredString: String):  List<String>{
    return enteredString.trim().splitToSequence(' ').filter { it.isNotEmpty() }.toList()
}

fun stringWithReverseWords(wordsList: List<String>) {
    var stringWithReverseWords = ""
    for (i in wordsList) {
        val reverseValue = i.reversed()
        stringWithReverseWords = "$stringWithReverseWords $reverseValue"
    }
    println("Sentence with reverse words are: ${stringWithReverseWords.trim()}")
}

fun main() {
    val enteredSting = takeInputFromUser()
    val wordsList = createWordsList(enteredSting)
    stringWithReverseWords(wordsList)
}
