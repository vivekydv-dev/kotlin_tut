fun main() {
    val myNum = listOf(33, 4, 26, 16, 34, 13, 9, 43)

    val check1 = myNum.all { it < 30 }// checks all elements are greater than 20 return true or false
    println(check1)

    val check2 = myNum.any { it > 30 }// does any of these element satisfy the condition
    println(check2)

    val check3 = myNum.count { it > 10 } //return total number of element that satisfy the condition
    println(check3)

    val check4 = myNum.find { it < 10 } //return first element that satisfy the condition
    println(check4)
}