fun main() {
   val c = myCClass.cFun(3,5)
    println(c)
}

class myCClass {

    companion object{
        fun cFun(a:Int,b:Int):Int{
            return a+b
        }
    }
}