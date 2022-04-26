object MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        for (i in m until (m + n)) {
            nums1[i] = nums2[i - m]
        }
        nums1.sort()
        nums1.forEach { it -> println("$it") }
    }
}

fun main() {
    val m_merge_class = MergeSortedArray
    val nums1 = intArrayOf(1, 2, 3, 4, 0, 0, 0)
    val nums2 = intArrayOf(1, 2, 5)

    m_merge_class.merge(nums1, 4, nums2, 3)

}