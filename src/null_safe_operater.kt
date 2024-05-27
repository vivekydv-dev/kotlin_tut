fun main() {
    var name: String? = null

    //1 safe call (?.)
    // returns the length if name is not null else return Null
    println(name?.length)

    //2 safe call with let (?.let)
    //it execute the block code if the name is not Null
    name?.let { println(name) }

//    3 Elvis -operater(?:)
//    ternary operater
    val len = name ?: "kartik"
    println(len)


//    4 Non null
//    use it when you are sure that the value is found to be not null
    name = "jahesh"
    println(name!!.length)
}