enum class CreditCardType(
    val clr: String,
    val num: Int = 10
) { //enum values are constants and by default assigned as inddex value
    Gold("goldd", 1),
    Silver("grayy"),
    Platinum("blackk", 3)
}

fun main() {
//    each enum object has two property : odinal and name
    println(CreditCardType.Platinum.ordinal) // odinal is used to get index of constant
    println(CreditCardType.Gold.name)

//    each object in enum has values() method for getting all values of enum in aaray of object form
    val myConst: Array<CreditCardType> = CreditCardType.values()
    println(myConst)
    myConst.forEach { println(it) }

    val perterCardType: CreditCardType = CreditCardType.Silver
    when (perterCardType) {
        CreditCardType.Gold -> println("peter card tye is gold")
        CreditCardType.Silver -> println("peter card tye is silver")
        CreditCardType.Platinum -> println("peter card tye is Platinum")
    }

    println(CreditCardType.Silver.num)
    println(CreditCardType.Gold.clr)
}