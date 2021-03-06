/*Given a string s, find the first non-repeating character in it and return its index.
 If it does not exist, return -1.
 */
object UniqueCharacter{
    fun firstUniqueChar (str : String): Int{
       for(i in str.indices){
           if(str.toList().count{it == str[i]} ==1)
                return i
       }
        return -1
    }
 }

fun main(){
    println("Unique Character is  ${UniqueCharacter.firstUniqueChar("asasd")}")
}
