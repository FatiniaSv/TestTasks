//сколькими способами можно пройти по лестнице из n ступенек, если хнаем что можно либо шагать на каждую лил через 2
object ClimbingStairs{
    fun searchForPossibleOption(n : Int) : Int{
        var step : Int =0
        if(n>0){
            step+=1//вариант пройти все единичными шагами
            val mem : Int = (n/2)
            if(mem>0) {
                step+=1
                step+=mem*2
            }
            if(n%2 >0 )//если нечетное кол-во ступенек
                step +=1
        }
        return step
    }
}

fun main (){
    println("${ClimbingStairs.searchForPossibleOption(7)}")
}