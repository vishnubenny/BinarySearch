package com.dsa.sort

fun findLargest(arr: IntArray): Int? {
    if (arr.isEmpty()) return null  // Handle empty array case

    var largest = arr[0]
    for (num in arr) {
        if (num > largest) {
            largest = num
        }
    }
    return largest
}

fun main() {
    val numbers = intArrayOf(3, 5, 7, 2, 8, 6)
    val largest = findLargest(numbers)

    if (largest != null) {
        println("The largest element is: $largest")
    } else {
        println("The array is empty")
    }
}
