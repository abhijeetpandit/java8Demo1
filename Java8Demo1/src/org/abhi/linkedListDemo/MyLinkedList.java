package org.abhi.linkedListDemo;

public class MyLinkedList {
	private MyLinkedList next;
	private String data;
	
	public MyLinkedList getNext() {
		return next;
	}

	public void setNext(MyLinkedList next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static void main(String[] args) {
		MyLinkedList element = new MyLinkedList();
		element.setData("First");
		
		MyLinkedList element1 = new MyLinkedList();
		element1.setData("Second");
		element.setNext(element1);
		
		MyLinkedList element2 = new MyLinkedList();
		element2.setData("Third");
		element1.setNext(element2);
		
		MyLinkedList element3 = new MyLinkedList();
		element3.setData("Fourth");
		element2.setNext(element3);
		
		MyLinkedList element4 = new MyLinkedList();
		element4.setData("Fifth");
		element3.setNext(element4);
		
		MyLinkedList myelement = element;
		
		while(myelement != null) {
			System.out.println(myelement.data);
			myelement = myelement.next;
		}
	}
}
