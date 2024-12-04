package bagliListe4uygulama;

public class ogrNode {
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	ogrNode next;
	
	//constructer oluşturuyoruz
	public ogrNode(int numara,String ad,String soyad,int vize,int fin) {
		this.ad= ad;
		this.soyad= soyad;
		this.vize= vize;
		this.fin= fin;
		
		ortalama = 0.4*vize+0.6*fin;
		if(ortalama>=50)
			durum ="geçti";
		else 
			durum="kaldı";
		
		next=null;
		
	}
	

}
