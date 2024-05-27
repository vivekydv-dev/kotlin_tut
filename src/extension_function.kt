fun main() {
    val stud = Student()

    val rst = stud.hasPassed(34)
    println(rst)

    val toper = stud isScholer 95 // infix function is also extension function with one parameter
    println(toper)

    val st1 = "hello"
    val st2 = "world"
    val st3 = "heyy"

    val rs = st3.add(st1, st2)
    println(rs)

    val greaterval = 51.greaterValue(7)
    println(greaterval)
}


class Student {
    fun hasPassed(mark: Int): Boolean {
        return mark > 35
    }
}

 infix fun Student.isScholer(mark:Int):Boolean{
    return mark>90
}

fun String.add(str1: String, str2: String): String {
    return this + str1 + str2
}

fun Int.greaterValue(other: Int): Int {
    if (this > other) {
        return this
    } else {
        return other
    }
}
