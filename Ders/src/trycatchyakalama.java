import java.util.Scanner;

public class trycatchyakalama {

	public static void main(String[] args) {
		// hata yakalama
		try {
			
			Scanner imp =new Scanner(System.in);
			int a,b,sonuc;
			
			System.out.println("a sayını girinz=");
			a = imp.nextInt();
			System.out.println("b sayısını giriniz =");
			b= imp.nextInt();
			
			sonuc = a/b;
			System.out.println("iki sayınn bölümü= "+sonuc);
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e+" hatası aldınız devam edebilirsiniz");
		}
		
		
		Scanner imp =new Scanner(System.in);
		int a,b,sonuc;
		
		System.out.println("a sayını girinz=");
		a = imp.nextInt();
		System.out.println("b sayısını giriniz =");
		b= imp.nextInt();
		
		
		
		

	}

}
