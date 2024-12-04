package bagliListe4uygulama;

public class node1 {
	
	int no;
	String ad;
	String soyad;
	int vize;
	int finall;
	String durum;
	
	node1 next;
	
	
	public node1(int no,String ad,String soyad,int vize,int finall) 
	{
		this.no=no;
		this.ad=ad;
		this.soyad=soyad;
		this.vize=vize;
		this.finall=finall;
		
		next=null;
	
		if(finall>50)
			durum="geçti";
		else
			durum="geçemedi";
		
	}

}
