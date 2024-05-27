fun main() {
    val m = mapOf<String, String>("a" to "rohan", "b" to "kartik") //immutable and fixed fize

    for (key in m.keys) {
        println(m[key])
    }


    val mm = mutableMapOf<String, String>("a" to "rohan", "b" to "kartik") //mutable and not fixed fize
    mm["c"] = "shivam"

    for (key in mm.keys) {
        println(mm[key])
    }
    println()
}