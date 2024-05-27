import java.awt.Color

fun main() {
    var an = Dog("black", "leebra")
    println(an.breed)
}
//
//open class Animal(var colr: String) {
//    init {
//        println("from animal init $colr")
//    }
//}
//
//class Dog(colr: String, breed: String) : Animal(colr) {
//    init {
//        println("from dog init : $colr $breed")
//    }
//}


open class Animal {
    constructor(colr: String) {
        println("from animal init $colr")
    }
}

class Dog : Animal {
    var breed: String = ""

    constructor(colr: String, breed: String) : super(colr) {
        println("from dog init : $colr $breed")
        this.breed = breed
    }
}
