package sarmallamakapsülleme;

public class Kişi {
	
	private String ad;     // kontrollü erişip kontrollü okucaiz
	private String soyad;
	private int yas;
	
	
	
	public void setAd(String a) {
		ad = a;
		
	}         // set etme yani değer girme
	
	public void setSoyad(String s) {
		soyad = s;
		
	}    
	
	public void setYas(int y) {
		if (yas>0 && yas<110) {
			yas = y;
			
		}else {
			yas =0;
			System.out.println("yaşı hatalı giriş yaptınz");
		}
		
		
	}
	
	public String getAd() {
		return ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public int getYas() {
		return yas;
	}
	
	
	
	public void yazdır() {
		
		System.out.println("adı    ;"+getAd());
		System.out.println("soyadı ;"+getSoyad());
		System.out.println("yas    ;"+getYas());
	}
	
	
	

}
