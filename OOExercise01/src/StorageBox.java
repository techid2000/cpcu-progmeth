class Node {
	Object obj;
	Node right;
	Node left;
	public Node(Object o) {
		obj = o;
	}
}

public class StorageBox {
	Node stack, head;
	int size, count;
	boolean unlimitSize;
	public StorageBox() {
		stack = new Node(null);
		head = stack;
		unlimitSize = true;
	}
	public StorageBox(int size) {
		stack = new Node(null);
		head = stack;
		this.size = size;
	}
	public boolean isEmpty() {
		return head == stack;
	}
	public boolean isFull() {
		return unlimitSize || count == size;
	}
	public void push(Object x) {
		if(unlimitSize || count < size) {
			Node newnode = new Node(x);
			head.right = newnode;
			newnode.left = head;
			head = newnode;
			count++;
		}
	}
	public Object pop() {
		if(head != stack) {
			head.left.right = null;
			Node tmp = head;
			head = head.left;
			count--;
			return tmp.obj;
		}
		return null;
	}
	public Object top() {
		if(head == stack) {
			return null;
		} else {
			return head.obj;
		}
	}
}
