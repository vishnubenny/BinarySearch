package com.dsa.trees

class BinaryTree {

    private var root: Node? = null

    fun populateRoot() {
        root = Node(10)
        populateLeft(root)
        root?.right = Node(20)
    }

    private fun populateLeft(node: Node?) {
        val left = Node(15)
        node?.left = left
    }
}

class Node(val value: Int) {
    var left: Node? = null
    var right: Node? = null
}

fun main() {
    BinaryTree().populateRoot()
}
