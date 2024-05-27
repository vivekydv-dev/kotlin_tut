//import kotlin.random.Random
//
//tailrec fun checkNumber(randNum: Int, yourNum: Any, count: Int) {
//    if (randNum == yourNum) {
//        println("****---you gussed in $count attempts---*****")
//    } else {
//        println("enter the number")
//        val userInput = readln()
//        if (isInteger(userInput)) {
////            println("randnum is = $randNum")
//            if (userInput.toInt() > randNum) {
//                println("you gussed greater number")
//            } else if (userInput.toInt() < randNum) {
//                println("you gussed lesser number")
//            }
//            return checkNumber(randNum, userInput.toInt(), count + 1)
//        }
//        println("input is not intiger")
//        return checkNumber(randNum, userInput, count)
//    }
//}
//
//fun isInteger(value: String): Boolean {
//    return try {
//        value.toInt()
//        true
//    } catch (e: NumberFormatException) {
//        false
//    }
//}
//
//fun main() {
//    val randomValue = Random.nextInt(10) + 1
//    checkNumber(randomValue, 0, 0)
//}
//


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
//            else -> break
        }
    } while (yourNum != randomValue)

    println("****---You guessed in $count attempts---*****")
}