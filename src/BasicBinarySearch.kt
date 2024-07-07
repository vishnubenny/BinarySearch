class BasicBinarySearch {

    fun binarySearch(arr: IntArray, target: Int): Int {
        var start = 0
        var end = arr.size - 1

        while (start <= end) {
            val mid = start + (end - start) / 2

            when {
                arr[mid] == target -> return mid
                arr[mid] < target -> start = mid + 1
                else -> end = mid - 1
            }
        }

        return -1 // Element not found
    }
}

fun main() {
    val numbers = intArrayOf(1, 3, 5, 7, 9, 11)
    val target = 7
    val index = BasicBinarySearch().binarySearch(numbers, target)

    if (index != -1) {
        println("Element found at index: $index")
    } else {
        println("Element not found")
    }
}
