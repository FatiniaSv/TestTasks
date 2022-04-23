/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
object ClimbingStairs{
    fun searchForPossibleOption(n : Int) : Int{
        var step =0
        if(n>0){
            step+=1//вариант пройти все единичными шагами
            println("$step")
            val mem : Int = (n/2)
            if(mem>0) {
                step+=1
                println("$step")
                step+=mem*2
                println("$step")
            }
            if(n%2 >0 )//если нечетное кол-во ступенек
                step +=1
        }
        return step
    }
    fun searchForPossibleOption2(n : Int) : Int{
        var step =0;
        for(  i in n-1 downTo  n-2 ) {
            step+=i
        }
        return step
    }
}

fun main (){
    println("${ClimbingStairs.searchForPossibleOption2(4)}")
}