package week4;

public class LinkedListBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LLNode<String> sNode1 = new LLNode<String>("B");
		LLNode<String> sNode2 = new LLNode<String>("C");
		
		System.out.println(sNode1.getInfo());
		System.out.println(sNode2.getInfo());
		System.out.println(sNode1.getLink());
		System.out.println(sNode2.getLink());
		
		sNode1.setLink(sNode2);
		
		System.out.println(sNode1.getLink());
		System.out.println(sNode2);

	}

}
