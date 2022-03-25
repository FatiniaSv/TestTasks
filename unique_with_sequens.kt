class UniqueWithSequence ( ) {
    fun findUnique(str : String ): Int{
        for (i in str.indices){
        if(str.asSequence().count{it == str[i]}.toInt()> 1){
            return i;
            }
        }
        return -1
    }
}

fun main(){
    val unque  = UniqueWithSequence()
    println("the num of unique ${unque.findUnique("errtted")}" )
}