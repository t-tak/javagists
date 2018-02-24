package com.javagists.simple.java.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author w w w. j a v a g i s t s . c o m
 *
 */
public class Node<T> {

	private T data = null;

	private List<Node<T>> children = new ArrayList<>();

	private Node<T> parent = null;

	public Node(T data) {
		this.data = data;
	}

	public Node<T> addChild(Node<T> child) {
		child.setParent(this);
		this.children.add(child);
		return child;
	}

	public void addChildren(List<Node<T>> children) {
		children.forEach(each -> each.setParent(this));
		this.children.addAll(children);
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	private void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public Node<T> getParent() {
		return parent;
	}
	
	// additional functions
	public Node<T> getRoot() {
		 if(parent == null){
		  return this;
		 }
		 return parent.getRoot();
	}
	
	public void deleteNode() {
		if (parent != null) {
			int index = this.parent.getChildren().indexOf(this);
			this.parent.getChildren().remove(this);
			for (Node<T> each : getChildren()) {
				each.setParent(this.parent);
			}
			this.parent.getChildren().addAll(index, this.getChildren());
		} else {
			deleteRootNode();
		}
		this.getChildren().clear();
	}
	 
	public Node<T> deleteRootNode() {
		if (parent != null) {
			throw new IllegalStateException("deleteRootNode not called on root");
		}
		Node<T> newParent = null;
		if (!getChildren().isEmpty()) {
			newParent = getChildren().get(0);
			newParent.setParent(null);
			getChildren().remove(0);
			for (Node<T> each : getChildren()) {
				each.setParent(newParent);
			}
			newParent.getChildren().addAll(getChildren());
		}
		this.getChildren().clear();
		return newParent;
	}
	
	//deletes all the leaf nodes under this node
	public void  deleteAllLeafNodes(){
		List<Node<T>> tobeDeletedChildren = new ArrayList<>();
		deleteAllLeafNodes(this, tobeDeletedChildren);
		tobeDeletedChildren.forEach(Node::deleteNode);
	}
	
	
	private void deleteAllLeafNodes(Node<T> node, List<Node<T>> tobeDeletedChildren) {
		node.getChildren().forEach(each ->  {
			if(each.getChildren().isEmpty()) {
				tobeDeletedChildren.add(each);
				return;
			}
			deleteAllLeafNodes(each, tobeDeletedChildren);
		});
	}
	

}