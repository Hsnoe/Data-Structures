package agacdenemee;

public class node {
	
	int no,not;
	String ad;
	
	node right;
	node left;
	public node(int no, int not, String ad) {
		this.no = no;
		this.not = not;
		this.ad = ad;
		left=null;
		right=null;
	}
	public node() {
		no=0;
		not=0;
		ad="";
		right=null;
		left=null;
	}
	
	
	
	

}
