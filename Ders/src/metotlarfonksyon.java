import java.util.Scanner;

public class metotlarfonksyon {
	
	static void selamver() {
		System.out.println("selamlarr..");
	}
	static int sayigönder() {
		Scanner input = new Scanner(System.in);
		int sayi1,sayi2;
		System.out.println("sai bir gir:");
		sayi1 = input.nextInt();
		System.out.println("ikinci bir gir:");
		sayi2 = input.nextInt();
		
		return sayi1+sayi2; // geri dönderen int boolean double olur
	}
	
	public static void main(String[] args) {
		selamver();  // bu geri döndermeyen fonksiyon void
		
		int baba = sayigönder();
		
		System.out.println(baba);
	}

}
