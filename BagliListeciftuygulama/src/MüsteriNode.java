
public class MüsteriNode {   //çift yönlü bağlıliste
	
	int id;
	String ad;
	String soyad;
	String tel;
	String adres;
	String urun;
	
	MüsteriNode next;
	MüsteriNode prev;
	
	
	public MüsteriNode(int id, String ad, String soyad, String tel, String adres,String urun) {
		
		this.id=id;
		this.ad=ad;
		this.soyad=soyad;
		this.tel=tel;
		this.adres=adres;
		this.urun=urun;
		
		next=null;
		prev=null;
		
	}

}
