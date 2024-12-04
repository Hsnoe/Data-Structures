import java.util.Scanner;

public class fonksiyonlar2 {
	
	
	static void selamver(String isim,int yaş) {  //parametreli fonksiyon
		
		System.out.println("selamlar..."+isim+"yaşınız........"+yaş);
	}
	
	static int carp (int s1, int s2) {
		
		int sonuc = s1*s2;
		return sonuc;
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		selamver("hasan",22);
		int s1,s2;
		System.out.println("sayi1 gir:");
		s1=imp.nextInt();
		System.out.println("s2 gir :");
		s2 = imp.nextInt();
		int carpim;
		carpim = carp(s1,s2);
		System.out.println(carpim);
	}

}
