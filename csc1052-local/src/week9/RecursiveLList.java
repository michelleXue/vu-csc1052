package week9;

import week5.LLNode;

public class RecursiveLList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create linked list of A, B, C, D, E
		LLNode<String> llist = new LLNode<String>("A");
		LLNode<String> B = new LLNode<String>("B");
		LLNode<String> C = new LLNode<String>("C");
		LLNode<String> D = new LLNode<String>("D");
		LLNode<String> E = new LLNode<String>("E");
		
		D.setLink(E);
		C.setLink(D);
		B.setLink(C);
		llist.setLink(B);
		
		recPrintListRev(llist);
		// iterPrintList(llist);

	}
	
	public static void recPrintListRev (LLNode<String> llist) {
		   
		if (llist != null) {
			
			recPrintListRev(llist.getLink());
			System.out.println(llist.getInfo());
		}

	}
	
	public static void iterPrintList(LLNode<String> listRef) {
		   
		   while (listRef != null) {
		      System.out.println(listRef.getInfo());
		      listRef = listRef.getLink();
		   }
	} 


}
