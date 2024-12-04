import java.util.Scanner;

public class Sinif1 {

	public static void main(String[] args) {
		System.out.println("ilk dersinimiz");
		System.out.println("ah be");
		int a =4;
		int z=21;
		int sayı;
		sayı=a+z;
		System.out.println(sayı);
		
		float x=2.2f;
		double s=4.8;
		double sonuc = x+s;
		System.out.println("sonucunuz: "+ sonuc);
		
		String isim1 = "semra";
		String soyisim1 = "oge";
		
		System.out.println(isim1+" "+soyisim1);
		
		char harf ='a';
		char rakam =1;
		System.out.println(harf+" "+rakam);
		
		boolean imp = true;
		System.out.println(imp);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayı girniz;");
		int number;
		number = scan.nextInt();
		System.out.println("sayınız "+number);
		
		int sayi3 =10;
		// sayi3-- eksiltme işlemi
		System.out.println(sayi3++);
		System.out.println(sayi3);
		

	}

}
