import java.math.BigInteger

fun main() {
    println(getFebonachiSeries(10, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFebonachiSeries(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) {
        return b
    } else {
        return getFebonachiSeries(n - 1, a + b, a)
    }
}