package string.palindrome

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

private fun isPalindromeString(text: String) {
    var reverseText: String = reverse(text)
    if (text == reverseText) {
        println("$text is Palindrome")
    } else {
        println("$text is not Palindrome")
    }
}

private fun reverse(input: String): String {
    if (input.isEmpty()) {
        return input
    }
    println("=== Steps ===")
    println(
        "input.get(input.length - 1): ${input[input.length - 1]}, input.substring(0, input.length - 1): ${
            input.substring(
                0,
                input.length - 1
            )
        }"
    )
    return input[input.length - 1] + reverse(input.substring(0, input.length - 1))
}

fun main() {
    val enteredString = takeInputFromUser()
    if (enteredString != "No string entered")
        isPalindromeString(enteredString)
}