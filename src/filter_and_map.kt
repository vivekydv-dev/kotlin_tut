fun main() {
    val mlist = listOf(14, 5, 7, 43, 12, 34, 23)
    val filteredList = mlist.filter { value -> value < 19 }
    println(filteredList)

    val mapeList = mlist.map { it * 2 }
    println(mapeList)


    val k = mlist.filter { value -> value < 19 }.map { it * 2 }
    println(k)


    class Pson(var name: String, var age: Int) {
    }

    val f = listOf<Pson>(Pson("rohit", 23), Pson("rohan", 73), Pson("kartik", 43))

    val s = f.filter { it.name.startsWith("r") }.map { it.name }
    println(s)
}