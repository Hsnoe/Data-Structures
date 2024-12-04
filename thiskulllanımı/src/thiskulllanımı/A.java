package thiskulllanımı;

public class A {
	
	String Ad;
	int yas;
	double sayi;
	
	
	A(String Ad , int yas, double sayi){
		
		this.Ad = Ad ;
		this.sayi = sayi ;
		this.yas = yas;
		
		
	}
	
	void yazdır() {
		
		
		System.out.println("ad  =  "+ Ad);
		System.out.println("yas = " +yas);
		System.out.println("sayi = "+sayi);
		
		System.out.println("----------");
		
	}

}
