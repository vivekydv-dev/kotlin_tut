fun main() {
// set is collection of unique element
    val st = setOf<String>("df", "rer", "sdfsd") // immutable and fixed size
    for (value in st) {
        println(value)
    }


//   hasset :- unique but sequence is not garanteed
//    var hSt = hashSetOf<String>("shivam","ritesh","bb") // mutable and not fixed size
//    hSt.add("deepak")
//    hSt.remove("bb")
//    for (value in hSt) {
//        println(value)
//    }

    var mSt = mutableSetOf<String>("shivam","ritesh","bb") // mutable and not fixed size
    mSt.add("deepak")
    mSt.remove("bb")
    for (value in mSt) {
        println(value)
    }
}