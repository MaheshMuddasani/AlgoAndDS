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
	
	public LinkedListNode deleteLinkedListNode(LinkedListNode headNode,int position){
		int size = size(headNode);
		if(position>size || position<1 ){
			System.out.println("Position of node to insert is invalid. The valid inputs are 1 to "+(size+1));
			return headNode;
		}
		
		if(position==1){
			LinkedListNode currentNode = headNode.getNext();
			headNode=null;
			return currentNode;
		}else{
			LinkedListNode previousNode = headNode;
			int count=1;
			while(count<=position-1){
				previousNode=previousNode.getNext();
				count++;
			}
			
			LinkedListNode currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode=null;
		}
		return headNode;
	}
	
	public static void main(String args[]){
		LinkedListNode linkedListNode = new LinkedListNode(30);
		for(int i=1;i<=10;i++){
		linkedListNode.insertInLinkedList(linkedListNode, new LinkedListNode(i*373), i);
		}
		printElements(linkedListNode);

		System.out.println("After deleting");
		int size = linkedListNode.size(linkedListNode);
		linkedListNode = linkedListNode.deleteLinkedListNode(linkedListNode, size-1);
		printElements(linkedListNode);
		
	}

	private static void printElements(LinkedListNode linkedListNode) {
		// TODO Auto-generated method stub
		LinkedListNode currNode = linkedListNode;
		while(currNode!=null){
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
		
		
		
		
	}
	
}
