fun main() {
//    println("enter name")
//    val str: String = readln()
//
//    when (str) {
//        "rohan" -> println("the name is rohan")
//        "kartik" -> println("the name is kartik")
//        "shivansh" -> {
//            println("the name is shivansh")
//        }
//        "pratik","rakesh" -> println("i think you are rakesh or pratik")
//        else -> {
//            println("unknown name")
//            println("i dont know you")
//        }
//    }


    println("Enter number from 1 to 100")
    val num = readln().toInt()

//    when (num) {
//        in 1..10 -> println("the number is between 1 to 10")
//        in 10..20 -> println("the number is between 10 to 20")
//        in 20..30 -> println("the number is between 20 to 30")
//        in 30..40 -> println("the number is between 30 to 40")
//        in 40..50 -> println("the number is between 40 to 50")
//        else -> println("the number is above 50")
//    }


//    When expression
    var str: String = when (num) {
        in 1..10 -> "the number is between 1 to 10"
        in 10..20 -> "the number is between 10 to 20"
        in 20..30 -> "the number is between 20 to 30"
        in 30..40 -> "the number is between 30 to 40"
        in 40..50 -> {
            "dfsdfsdfdsfs"
            "the number is between 40 to 50"  // what ever we write at the end of the code block is returned
        }

        else -> "the number is above 50"
    }
    println(str)
}