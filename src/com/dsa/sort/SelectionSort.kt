package com.dsa.sort

fun findMaxIndex(arr: IntArray, start: Int, end: Int): Int {
    var maxIndex = start
    for (i in start + 1 until end) {
        if (arr[i] > arr[maxIndex]) {
            maxIndex = i
        }
    }
    return maxIndex
}

fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}

fun selectionSort(arr: IntArray) {
    val n = arr.size
    for (i in n - 1 downTo 1) {
        val maxIndex = findMaxIndex(arr, 0, i + 1)
        if (maxIndex != i) {
            swap(arr, maxIndex, i)
        }
    }
}

fun main() {
    val numbers = intArrayOf(64, 25, 12, 22, 11)
    println("Unsorted array: ${numbers.joinToString(", ")}")

    selectionSort(numbers)
    println("Sorted array: ${numbers.joinToString(", ")}")
}
