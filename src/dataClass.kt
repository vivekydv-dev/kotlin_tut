fun main() {
    var p1 = myData("shreyah", 23)
    var p2 = myData("shreyah", 23)
    var p3 = myData("rishab", 3)
    println(p1)
    println(p1 == p2)
    var p4 = p1.copy(name = "deepak")
    println(p4)

    val (a, b) = p1
    println(a)
    println(b)

    println(p3.component1())
    println(p3.component2())
}

data class myData(val name: String, val age: Int)