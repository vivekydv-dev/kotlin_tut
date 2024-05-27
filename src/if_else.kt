fun main() {
    val a = 9
    val b = 6

//    if else condition with expression
    var maxValue: Int = if (a > b) a else b
    println(maxValue)

    val mValue: Int = if (a > b) {
        println("the a value is grater than b")
        a  // the last statemt of this block will return
    } else {
        println("the b value is greater than b")
        b // the last statemt of this block will return
    }
    println(mValue)
}