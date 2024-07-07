
class CyclicSort {

    fun cyclicSort(arr: IntArray) {
        var i = 0
        while (i < arr.size) {
            val correctIndex = arr[i] - 1
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex)
            } else {
                i++
            }
        }
    }

    fun swap(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }
}

fun main() {
    val numbers = intArrayOf(3, 5, 2, 1, 4)
    println("Unsorted array: ${numbers.joinToString(", ")}")

    CyclicSort().cyclicSort(numbers)
    println("Sorted array: ${numbers.joinToString(", ")}")
}
