fun main() {
val p =Personss()
    p.myfun()
    p.myfun2()
}

interface MyinterfaceListner {
    var name: String // proprty in interface are abstract by default
    fun myfun() {
        println("hello")
    }
    fun myfun2()
    fun myfun3() {
        println("helloooooooo")
    }
}

class Personss : MyinterfaceListner {
    override var name: String = "shivansh"

    override fun myfun2() {
        super.myfun3()
        println("hello world")
    }
}