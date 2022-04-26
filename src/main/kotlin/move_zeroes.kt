//нужно найти 0 в массиве и поставить их в конец
class FindZero() {
    fun moveZeroes(nams: IntArray): Unit {
        for ((index, value) in nams.withIndex()) {
            if (value == 0) {
                for (i in (index + 1) until nams.size)
                    nams[i - 1] = nams[i]
                nams[nams.lastIndex] = 0
            }

        }
    }
}

fun main() {
    val classFind = FindZero()
    val numArray = intArrayOf(1, 2, 3, 0, 5, 0, 6, 0)
    // val numNUll = intArrayOf(0)
    classFind.moveZeroes(numArray)
    // classFind.moveZeroes(numNUll)
    // numArray.forEach { i -> println("the elemnt of array it $i") }
    println(numArray.contentToString())
    // println(numNUll.contentToString())

}