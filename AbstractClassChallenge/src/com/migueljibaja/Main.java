package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
	    /*MyLinkedList myLinkedList = new MyLinkedList(null);
	    myLinkedList.traverse(myLinkedList.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        //String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            myLinkedList.addItem(new Node(s));

        }
        myLinkedList.traverse(myLinkedList.getRoot());
        myLinkedList.removeItem(new Node("Perth"));
        myLinkedList.traverse(myLinkedList.getRoot());
        myLinkedList.removeItem(new Node("Adelaide"));
        myLinkedList.traverse(myLinkedList.getRoot());
        myLinkedList.removeItem(new Node("Sydney"));
        myLinkedList.traverse(myLinkedList.getRoot());
*/
	    SearchTree myTree = new SearchTree(null);
        myTree.traverse(myTree.getRoot());
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            myTree.addItem(new Node(s));

        }
        myTree.traverse(myTree.getRoot());
        myTree.removeItem(new Node("Perth"));
        myTree.traverse(myTree.getRoot());
    }
}
