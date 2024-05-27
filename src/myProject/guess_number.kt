package myProject

import kotlin.random.Random

fun main() {
    val randomValue = Random.nextInt(100) + 1
    var count = 0
    var yourNum = 0

    do {
        println("Enter a number between 1 and 100:")
        val userInput = readln()
        yourNum = try {
            userInput.toInt()
        } catch (e: NumberFormatException) {
            println("Input is not an integer. Please try again.")
            continue
        }

        count++
        when {
            yourNum < randomValue -> println("You guessed a lesser number.")
            yourNum > randomValue -> println("You guessed a greater number.")
        }
    } while (yourNum != randomValue)

    println("****---You guessed in $count attempts---*****")
}