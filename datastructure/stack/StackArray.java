package datastructure.stack;

public class StackArray<TYPE> {
	private int size;
	private int cap;
	int top;
	private TYPE[] data;
	
	public StackArray() {
		this(1000);
	}
	
	@SuppressWarnings("unchecked")
	public StackArray(int size) {
		this.data = (TYPE[]) new Object[size];
		this.cap = size;
		this.size = 0;
		this.top = -1;
	}
	
	public boolean isEmpty(){
		return (this.size == 0);
	}
	
	public boolean push(TYPE x) {
		if(this.size == this.cap) {
			return false;
		}

		this.size++;
		this.data[++top] = x;
		return true;
	}
	
	public TYPE pop() {
		if(this.size < 1) {
			return null;
		}
		
		this.size--;
		TYPE res = this.data[top];
		this.data[top--] = null;
		return res;
	}
	
	public TYPE peek() {
		if(this.size == 0) {
			return null;
		}
		
		return this.data[this.top];
	}
	
	public String toString() {
		String txt = "";
		for(int i = size-1; i >= 0; i--) {
			txt += this.data[i].toString() + "\n";
		}
		return txt;
	}
	
}

