import com.shreks.Person

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    println("Hello, " + name + "!")

    for (i in 1..5) {

        println("i = $i")
    }
    val obj = Person("shubham")
    obj.myFun()


    var str="sham"
    println("my name is $str and the length og my name is ${str.length}")
}

