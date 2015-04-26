/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author Sinarik
 */
class Node {

    int key;

    Node leftChild;
    Node rightChild;

    Node(int key) {
        this.key = key;

    }

    public String toString() {
        return "has the key" + key;
    }
}
