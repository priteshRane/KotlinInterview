package string

private fun takeInputFromUser(): String {
    print("Enter string to check: ")
    val enteredString = readLine()
    if (!enteredString.isNullOrEmpty()) {
        println("String entered is $enteredString")
        return enteredString.replace("\\s".toRegex(), "")
    }
    return "No string entered"
}

private fun countDuplicateCharacters(enteredSting: String): Int {
    val countIs = enteredSting.length - enteredSting.toCharArray().distinct().count()
    println("duplicate characters count is $countIs")
    return countIs
}

private fun findAndPrintDuplicateCharacters(enteredSting: String, countIs: Int) {
    val distinctChar = mutableListOf<Char>()
    val duplicateChar = mutableListOf<Char>()
    val enteredStringCharArray = enteredSting.toCharArray()
    for (i in enteredStringCharArray.indices) {
        if (countIs == duplicateChar.size) {
            break
        }
        if (!distinctChar.contains(enteredStringCharArray[i])) {
            distinctChar.add(enteredStringCharArray[i])
        } else {
            if (!duplicateChar.contains(enteredStringCharArray[i])) {
                duplicateChar.add(enteredStringCharArray[i])
            }
        }
    }
    println("Duplicate characters are: $duplicateChar")
}

fun findAndPrintDuplicateCharactersWithCount(enteredSting: String, countIs: Int) {
    val distinctChar = mutableListOf<Char>()
    val duplicateChar = mutableMapOf<Char, Int>()
    val enteredStringCharArray = enteredSting.toCharArray()
    for (i in enteredStringCharArray.indices) {
        if (countIs == duplicateChar.size) {
            break
        }
        if (!distinctChar.contains(enteredStringCharArray[i])) {
            distinctChar.add(enteredStringCharArray[i])
        } else {
            if (duplicateChar.contains(enteredStringCharArray[i])) {
                duplicateChar[enteredStringCharArray[i]] = duplicateChar[enteredStringCharArray[i]]!! + 1
            } else {
                duplicateChar[enteredStringCharArray[i]] = 1
            }
        }
    }
    println(duplicateChar)
}

private fun removeDuplicateCharacters(enteredString: String) {
    val removeDuplicateCharacters = enteredString.toCharArray().distinct().joinToString("")
    println("String after removing duplicates: $removeDuplicateCharacters")
}

fun main() {
    val enteredSting = takeInputFromUser()
    val countIs = countDuplicateCharacters(enteredSting)
    findAndPrintDuplicateCharacters(enteredSting, countIs)
    findAndPrintDuplicateCharactersWithCount(enteredSting, countIs)
    removeDuplicateCharacters(enteredSting)
}
