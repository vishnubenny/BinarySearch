package com.dsa.linkedlist

class SearchKthLinkedList {

    // Define a class for the nodes in the linked list
    data class ListNode<T>(var value: T, var next: ListNode<T>? = null)

    // Function to find the k-th node in the linked list
    fun <T> findKthNode(head: ListNode<T>?, k: Int): ListNode<T>? {
        var current = head
        var count = 0

        // Traverse the linked list until the k-th node is found
        while (current != null) {
            if (count == k) {
                return current
            }
            count++
            current = current.next
        }

        // If the linked list has fewer than k elements, return null
        return null
    }

    // Helper function to create a linked list from a list of values
    fun <T> createLinkedList(values: List<T>): ListNode<T>? {
        if (values.isEmpty()) return null
        val head = ListNode(values[0])
        var current = head
        for (i in 1 until values.size) {
            val newNode = ListNode(values[i])
            current.next = newNode
            current = newNode
        }
        return head
    }
}

// Test the function
fun main() {
    val searchKthLinkedList = SearchKthLinkedList()
    val values = listOf(1, 2, 3, 4, 5)
    val head = searchKthLinkedList.createLinkedList(values)
    val k = 2

    val kthNode = searchKthLinkedList.findKthNode(head, k)
    if (kthNode != null) {
        println("The value of the k-th node is: ${kthNode.value}")
    } else {
        println("The linked list has fewer than $k elements.")
    }
}
