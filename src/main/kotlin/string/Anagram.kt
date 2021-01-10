package string

private fun takeFirstInputFromUser(): String {
    print("Enter first string: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("First entered string is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun takeSecondInputFromUser(): String {
    print("Enter second string: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("Second entered string is $enteredString")
        return enteredString
    }
    return "No string entered"
}

private fun findIsAnagramOrNot(firstString: String, secondString: String) {
    val firstStringToCharArray = firstString.toCharArray()
    val secondStringToCharArray = secondString.toCharArray()

    if (firstStringToCharArray.sort() == secondStringToCharArray.sort()) {
        println("Yes, is Anagram")
    } else {
        println("No, It's not Anagram")
    }
}

fun main() {
    val firstString = takeFirstInputFromUser()
    val secondString = takeSecondInputFromUser()
    findIsAnagramOrNot(firstString, secondString)
}
