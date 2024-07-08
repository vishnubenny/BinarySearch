package com.dsa.trees

class TreeNode<T : Comparable<T>>(var value: T) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}

class BinarySearchTree<T : Comparable<T>> {
    var root: TreeNode<T>? = null

    // Insertion
    fun insert(value: T) {
        root = insertRec(root, value)
    }

    private fun insertRec(current: TreeNode<T>?, value: T): TreeNode<T> {
        if (current == null) {
            return TreeNode(value)
        }

        if (value < current.value) {
            current.left = insertRec(current.left, value)
        } else if (value > current.value) {
            current.right = insertRec(current.right, value)
        }

        return current
    }

    // Search
    fun search(value: T): Boolean {
        return searchRec(root, value)
    }

    private fun searchRec(current: TreeNode<T>?, value: T): Boolean {
        if (current == null) {
            return false
        }

        return when {
            value == current.value -> true
            value < current.value -> searchRec(current.left, value)
            else -> searchRec(current.right, value)
        }
    }

    // In-order Traversal
    fun inorderTraversal() {
        inorderRec(root)
    }

    private fun inorderRec(current: TreeNode<T>?) {
        if (current != null) {
            inorderRec(current.left)
            print("${current.value} ")
            inorderRec(current.right)
        }
    }
}

fun main() {
    val bst = BinarySearchTree<Int>()

    // Insert elements
    bst.insert(50)
    bst.insert(30)
    bst.insert(20)
    bst.insert(40)
    bst.insert(70)
    bst.insert(60)
    bst.insert(80)

    // Search for elements
    println("Is 40 in the tree? ${bst.search(40)}")
    println("Is 25 in the tree? ${bst.search(25)}")

    // In-order traversal
    print("In-order traversal: ")
    bst.inorderTraversal()
}
