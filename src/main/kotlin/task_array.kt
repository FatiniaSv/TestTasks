//Single Number


class SingleNumber() {
    fun showSingleNumber(nums: IntArray) {
        var isSingle = true
        for ((index, value) in nums.withIndex()) {
            isSingle = true
            for (i in nums.indices - index) {
                if (value == nums[i]) {
                    isSingle = false
                    break
                }
            }
            if (isSingle) {
                println("$value")
                return
            }
        }
    }
}

fun main() {
    println("hello in Single Number")
    val singl = SingleNumber();
    val nums = intArrayOf(1, 1, 2, 2, 4, 5, 5, 6, 6)
    println("${singl.showSingleNumber(nums)}")
}