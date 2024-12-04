package quequePideci;

public class Node {
	String isim;
	int adet;
	int ucret;
	Node next;
	
	public Node(int adet, String isim) 
	{
		this.adet=adet;
		this.isim=isim;
		ucret= adet * 4;
		next=null;
		
		
	}
	
	

}
