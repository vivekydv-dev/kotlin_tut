fun main() {
    var myfun = { a: Int, b: Int -> if (a > b)  a else b }
    println(myfun(4, 5))
}