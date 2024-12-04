package agacsilme;

public class node {
	
	int no;
	String ad;
	int not;
	
	node right;
	node left;
	
	
	public node() 
	{
		no=0;
		ad="";
		not=0;
		right=null;
		left=null;
		
	}


	public node(int no, String ad, int not) {
		this.no = no;
		this.ad = ad;
		this.not = not;
		right=null;
		left=null;
	}
	
	
	
	

}
