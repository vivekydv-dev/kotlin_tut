fun main() {
//    by default all function and classes are public in nature
//    public
//    private
//    protected
//    internal


    val obj1 = Person()
    // a,b are not visible
    //c,d are visible
    println(obj1.c)
}

open class Person {
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4
}

class Indian : Person() {
    //a is not visible
    // b,c,d are visible

    fun test() {
        println(b)
    }
}