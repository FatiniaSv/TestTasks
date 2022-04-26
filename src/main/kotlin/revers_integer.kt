/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the
signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
object ReversInteger {
    fun revers(num: Int): Int {
        val str: String = num.toString()
        val numRevers = str.reversed().toInt()
        return if (numRevers > -232 && numRevers < 230) numRevers else 0
    }
}

fun main() {
    println("${ReversInteger.revers(145)}")
}