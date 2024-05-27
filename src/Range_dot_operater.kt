fun main() {
//    this range contain number 1 to 5
    val num1 = 1..5
    for (i in num1) {
        println(i)
    }

//    this range contain number 5 to 1
    val num2 = 5 downTo 1
    for (i in num2) {
        println(i)
    }

//    this range contain number 1, 3, 5
    val num3 = 1..5 step 2
    for (i in num3) {
        println(i)
    }

    val charact = 'a'..'z'
    for (i in charact) {
        println(i)
    }

//    to check if the value is present or not
    val isPresent = 'f' in charact
    println(isPresent)
}