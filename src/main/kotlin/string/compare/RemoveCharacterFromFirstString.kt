package string.compare

private fun takeFirstInputFromUser(): String {
    print("Enter first string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("First string entered is $enteredString")
        return enteredString.replace("\\s".toRegex(), "")
    }
    return "No string entered"
}

private fun takeSecondInputFromUser(): String {
    print("Enter second string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("Second string entered is $enteredString")
        return enteredString.replace("\\s".toRegex(), "")
    }
    return "No string entered"
}

private fun findDistinctCharacterFromFirstString(enteredFirstSting: String) : List<Char> {
    return enteredFirstSting.toCharArray().distinct()
}

fun main() {
    var enteredFirstSting = takeFirstInputFromUser()
    val enteredSecondSting = takeSecondInputFromUser()
    val distinctCharFromFirstString = findDistinctCharacterFromFirstString(enteredFirstSting)
    println(distinctCharFromFirstString)

    for (i in distinctCharFromFirstString.indices) {
        if (enteredSecondSting.contains(distinctCharFromFirstString[i], true)) {
            enteredFirstSting = enteredFirstSting.replace(distinctCharFromFirstString[i].toString(), "", true)
        }
    }

    println(enteredFirstSting)
}
