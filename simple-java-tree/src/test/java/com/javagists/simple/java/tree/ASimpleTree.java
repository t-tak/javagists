package com.javagists.simple.java.tree;

import java.util.ArrayList;
import java.util.List;

public class ASimpleTree {

	public static void main(String[] args) {
		Node<String> root = createTree();
		printTree(root, " ");
		
		// test the deletion of all leaf nodes
		root.deleteAllLeafNodes();
		printTree(root, " ");
	}
 

	private static Node<String> createTree() {
		Node<String> root = new Node<>("root");
				
		Node<String> node1 = root.addChild(new Node<String>("node 1"));
		
		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		Node<String> node111 = node11.addChild(new Node<String>("node 111"));
		Node<String> node112 = node11.addChild(new Node<String>("node 112"));
		
		Node<String> node12 = node1.addChild(new Node<String>("node 12"));
		
		Node<String> node2 = root.addChild(new Node<String>("node 2"));
		
		Node<String> node21 = node2.addChild(new Node<String>("node 21"));
		Node<String> node211 = node2.addChild(new Node<String>("node 22"));
		return root;
	}
	
	 private static <T> void printTree(Node<T> node, String appender) {
		  System.out.println(appender + node.getData());
		  node.getChildren().forEach(each ->  printTree(each, appender + appender));
	 }
	 
}
