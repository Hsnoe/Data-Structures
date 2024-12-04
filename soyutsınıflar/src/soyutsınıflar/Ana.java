package soyutsınıflar;

public class Ana {
	public static void main(String[] args) {
		
		SoyutSınıf ss;
		
		Hesap hesap = new Hesap();
		
		int a ; 
		int b ;
		a=5;
		b=8;
		
		System.out.println("toplama sonucu ; "+ hesap.topla(a, b));
		System.out.println("çıkarma sonucu ; "+ hesap.çıkar(a, b));
		System.out.println("bölme sonucu ; "+ hesap.böl(a, b));
		System.out.println("çarpma sonucu ; "+ hesap.carp(a, b));
		
	}

}
