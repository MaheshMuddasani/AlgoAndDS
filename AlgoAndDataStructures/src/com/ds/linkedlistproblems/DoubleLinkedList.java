package com.ds.linkedlistproblems;

public class DoubleLinkedList {

	private int data;
	private DoubleLinkedList next;
	private DoubleLinkedList previous;
	
	public DoubleLinkedList(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleLinkedList getNext() {
		return next;
	}
	public void setNext(DoubleLinkedList next) {
		this.next = next;
	}
	public DoubleLinkedList getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleLinkedList previous) {
		this.previous = previous;
	}
	
	public int size(DoubleLinkedList headNode){
		int length=0;
		DoubleLinkedList doubleLinkedList = headNode;
		while(doubleLinkedList!=null){
			length++;
			doubleLinkedList = doubleLinkedList.getNext();
		}
		return length;
	}
	public DoubleLinkedList insertintoDoubleLinkedList(DoubleLinkedList headNode,DoubleLinkedList nodeToInsert,int position){
		int size = size(headNode);
		if(headNode==null){
			return nodeToInsert;
		}
		if(position>size+1 || position<1){
			System.out.println("Invalid Position");
			return nodeToInsert;
		}
		if(position==1){
			nodeToInsert.setNext(headNode); 
			headNode.setPrevious(nodeToInsert);
			return nodeToInsert;
		}else{
			DoubleLinkedList previousNode = headNode;
			int count=1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			DoubleLinkedList currNode = previousNode.getNext(); 
			nodeToInsert.setNext(currNode);
			if(currNode!=null){
				currNode.setPrevious(nodeToInsert);
			}
			previousNode.setNext(nodeToInsert);
			nodeToInsert.setPrevious(previousNode);
		}
		return headNode;
	}
	
	public DoubleLinkedList deleteDoubleLinkedListNode(DoubleLinkedList headNode,int position){
		int size = size(headNode);
		if(position>size || position<1){
			System.out.println("Invalid Input");
			return headNode;
		}
		
		if(position==1){
			DoubleLinkedList currentNode = headNode;
			headNode=null;
			currentNode.setPrevious(null);
			return currentNode;
		}else{
			DoubleLinkedList previousNode = headNode;
			int count=1;
			while(count<position-1){
				previousNode = previousNode.getNext();
				count++;
			}
			DoubleLinkedList currentNode = previousNode.getNext();
			DoubleLinkedList laterNode = currentNode.getNext();
			previousNode.setNext(laterNode);
			if(laterNode!=null){
				laterNode.setPrevious(previousNode);
			}
			currentNode=null;
		}
		return headNode;
	}
	
	public static void main(String args[]){
		DoubleLinkedList linkedListNode = new DoubleLinkedList(30);
		for(int i=1;i<=10;i++){
		linkedListNode.insertintoDoubleLinkedList(linkedListNode, new DoubleLinkedList(i*373), i);
		}
		
		linkedListNode.insertintoDoubleLinkedList(linkedListNode, new DoubleLinkedList(373), 4);
		printElements(linkedListNode);

		System.out.println("After deleting");
		int size = linkedListNode.size(linkedListNode);
		linkedListNode = linkedListNode.deleteDoubleLinkedListNode(linkedListNode, 4);
		printElements(linkedListNode);
		
	}

	private static void printElements(DoubleLinkedList linkedListNode) {
		// TODO Auto-generated method stub
		DoubleLinkedList currNode = linkedListNode;
		while(currNode!=null){
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
	}
}
