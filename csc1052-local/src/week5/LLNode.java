package week5;

public class LLNode<T> {
	
	protected T info;   // data of node
	protected LLNode<T> link;  // reference to next node
	
	public LLNode (T info) {
		this.info = info;
		link = null;
	}
	
	public LLNode () {
		
	}
	
	public void setInfo(T info) { // update the data of node
		this.info = info;
	}
	
	public T getInfo() { // get the data of node
		return info;
	}
	
	public void setLink(LLNode<T> link) { // set link of the node
		this.link = link;
	}
	
	public LLNode<T> getLink() { //get link of the node
		return link;
	}
	
}
