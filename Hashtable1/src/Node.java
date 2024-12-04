
public class Node {
	int key;
	String ad;
	Node next;
	
	public Node() {    // boşsa göstericisini null atadım 
		next=null;
	}

	public Node(int key, String ad) {
		this.key=key;
		this.ad=ad;
		next=null;
		
	}
	

}
