fun main() {
    val c = Country()
//    println(c.nName)
    c.setUp()
}

class Country {
    lateinit var nName: String
    fun setUp(){
        nName="harsh"
        println("The name of country is $nName")
    }
}