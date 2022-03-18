object ReversInteger{
    fun revers( num: Int) : Int {
        val str:String = num.toString()
        val numRevers = str.reversed().toInt()
        return if(numRevers > -232 && numRevers < 230) numRevers else 0
    }
}

fun main (){
    println("${ReversInteger.revers(145)}")
}