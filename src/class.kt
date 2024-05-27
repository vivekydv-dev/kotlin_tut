fun main() {
//    var st = Studs("Rihan")
//    println(st.name)

    var sts = Students("Rohan","shyam")
    println(sts.m)
}

class Studs(val name: String) { //parameter with property declaration
    init {
        println("the student name is $name")
    }
}

class Students(val name: String) {
    var m = ""
    init {
        println("the student name is $name")
    }
    constructor(a: String, b: String) : this(a) {   // we cannot declare property in secondary constucture
        m = b  //the body of secondry constructor is called after the init block
        println("secondary constuctor")
    }
}