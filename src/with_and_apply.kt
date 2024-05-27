fun main() {
    val p = Passion()
    with(p) {  //in with we can't call methods after the initialization
        name = "rohan"
        age = 23
    }
    println(p.name)
    println(p.age)

    val p2 = Passion()
    p2.apply {  //in apply we can call methods after the initialization
        name = "sfs"
        age = 2
    }.startRun()

    println(p2.name)
    println(p2.age)

}

class Passion {
    var name: String = ""
    var age: Int = 0

    fun startRun() {
        println("hello")
    }
}