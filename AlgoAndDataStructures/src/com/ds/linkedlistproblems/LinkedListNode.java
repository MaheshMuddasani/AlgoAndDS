package com.ds.linkedlistproblems;

public class LinkedListNode {
	
	private int data;
	private LinkedListNode next;
	
	public LinkedListNode(int data){
		this.data=data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	public int size(LinkedListNode headNode){
		int length=0;
		LinkedListNode currentNode = headNode;
		while(currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	public LinkedListNode insertInLinkedList(LinkedListNode headNode, LinkedListNode nodeToInsert, int position){
		if(headNode == null)
			return nodeToInsert;
		
		int size= size(headNode);
		if(position>size+1 || position<1){
			System.out.println("Position of node to insert is invalid. The valid inputs are 1 to "+(size+1));
			return headNode;
		}
		if(position==1){
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}else{
			LinkedListNode previousNode = headNode;
			int count= 1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			
			LinkedListNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}
}
