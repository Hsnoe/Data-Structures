
public class node1 {
	
	int no;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	node1 next;
	
	public node1(int no,String ad,String soyad,int vize,int fin) 
	{
		this.no=no;
		this.ad=ad;
		this.soyad=soyad;
		this.vize=vize;
		this.fin=fin;
		ortalama = (0.6*fin)+ (vize * 0.4);
		
		if(ortalama >50)
			durum="geçti";
		else
			durum="geçemedi";
		
		next=null;
		
	}

}
