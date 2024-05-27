fun main() {
//    for(i in 1..10){
//        println(i)
//    }

//    var i = 0
//    while (i <= 10) {
//        if (i % 2 == 0) {
//            println(i)
//        }
//        i++
//    }


//    var m = 33
//    do {
//        println(m)
//        m++
//    } while (m <= 10)


//    labeled for loop with break
//    myloop@ for (s in 1..10) {
//        for (t in 1..10) {
//            println("the outer loop $s and the inner loop $t")
//            if (s == 5 && t == 5) {
//                break;
//            }
//            if (s == 7 && t == 7) {
//                break@myloop
//            }
//        }
//    }


//contine
    myloop2@ for (a in 1..10) {
        for (b in 1..10) {
            if (a == 5 && b == 5) {
                continue
            }
            if (a == 7 && b == 7) {
                continue@myloop2
            }
            println("the outer loop $a and the inner loop $b")
        }
    }
}