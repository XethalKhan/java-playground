package datastructure.linkedlist;

public class SinglyLinkedList<TYPE> {
	public Node<TYPE> head;
	
	class Node<DATA> {
		public DATA data;
		public Node<DATA> next;
		
		public Node(DATA data){
			this.data = data;
			this.next = null;
		}
	}
	
	public SinglyLinkedList(TYPE data) {
		this.head = new Node<TYPE>(data);
	}
	
	public SinglyLinkedList() {
		this.head = null;
	}
	
	public void prepend(TYPE data) {
		Node<TYPE> pointer = this.head;
		
		if(pointer == null) {
			this.head = new Node<TYPE>(data);
			return;
		}
		
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = new Node<TYPE>(data);
		return;
	}
	
	public void append(TYPE data) {
		Node<TYPE> input = new Node<TYPE>(data);
		input.next = this.head;
		this.head = input;
		return;
	}
	
	public void delete(int position) 
    {  
        if (this.head == null) {
            return; 
        }
  
        Node<TYPE> temp = this.head; 
  
        if (position == 0) 
        { 
            this.head = temp.next;
            return; 
        } 
  
        for (int i=0; temp!=null && i<position-1; i++) {
            temp = temp.next; 
        }
  
        if (temp == null || temp.next == null) {
            return; 
        }
  
        Node<TYPE> next = temp.next.next; 
        temp.next.next = null;
  
        temp.next = next;   
    } 
	
	public TYPE get(int position) {
		Node<TYPE> current = this.head;
		int count = 0;
		
		while(current != null) {
			if(count == position) {
				return (TYPE)current.data;
			}
			count++;
			current = current.next;
		}
		
		return null;
	}

	
	public String toString() {
		Node<TYPE> pointer = this.head;
		String txt = new String();
		
		if(pointer == null) {
			txt = "Empty list";
			return txt;
		}
		
		while(pointer.next != null) {
			txt += pointer.data.toString() + "\n";
			pointer = pointer.next;
		}
		txt += pointer.data.toString() + "\n";
		
		return txt;
	}
}
