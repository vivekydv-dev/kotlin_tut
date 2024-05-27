fun main() {
//val k =Persons()

}

//cannot create an instance of abstarct class
// the role of abstract class is to provide set of methoths and property
//abstract method does not have body when declared
//abstract property cannot be initialized when declared
//we need to override the property and method inside child class

abstract class Persons {
    val m="dsfsd"
    abstract var name: String
    abstract fun myfunc()
    fun myfun2() {
        println("hello")
    }
}

class Indians : Persons() {
    override var name = "pavan"
    override fun myfunc() {
        println("Abstract method")
    }
}