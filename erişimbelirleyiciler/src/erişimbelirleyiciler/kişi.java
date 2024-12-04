package erişimbelirleyiciler;

public class kişi {
	String ad;
	private String soyad;
	int yas;
	
	public kişi(String a,String s,int y) {
		ad = a;
		soyad = s;
		yas = y;
	}
	
	
	public void yazdır() {
		
		System.out.println(ad);
		System.out.println(soyad);
		System.out.println(yas);
	}

}
