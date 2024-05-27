fun main() {
    println(ObjDeclaration.name)
    ObjDeclaration.name = "kartik"
    println(ObjDeclaration.name)
    println(ObjDeclaration.age)
    ObjDeclaration.student()


    //object expression
    var objExpression = object:Clonable {
        var ename = "satish"
        var eage = 45
        fun estudent() {
            println("student name is $ename and age is $eage")
        }
        override fun clone() {
           println("clonableeeeee")
        }

    }
    println(objExpression.ename)
    objExpression.ename = "pavan"
    println(objExpression.ename)
    println(objExpression.eage)
    objExpression.estudent()
    objExpression.clone()


}

object ObjDeclaration {
    var name = "rohan"
    var age = 23

    fun student() {
        println("student name is $name and age is $age")
    }
}
interface Clonable{
    fun clone()
}