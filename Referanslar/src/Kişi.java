
public class Kişi {
	
	String ad ;
	String soyad;
	int yas;
	
	Kişi(String a , String s ,int y){
		
		ad = a;
		soyad = s;
		yas = y;
	}
	
	void yazdır() {
		
		System.out.println("ad   :" + ad);
		System.out.println("soyad   :" + soyad);
		System.out.println("yas   :" + yas);
		System.out.println("----------------");
		
	}

}
