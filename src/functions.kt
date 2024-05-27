fun main() {
    val sum = add(3, 6)
    println("the sum is $sum")

    val result = findVolume(5,4,)
    println(result)

    val subResult = sub(b=10,a=5)
    println(subResult)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

//default parameter
fun findVolume(length: Int, breadth: Int, height: Int = 3): Int {
    return length * breadth * height
}

//named parameter
fun sub(a: Int, b: Int): Int {
    return b-a
}