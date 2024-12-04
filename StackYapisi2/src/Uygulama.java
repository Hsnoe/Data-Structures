import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackYapisi liste = new StackYapisi(10);
		
		int secim =-1;
		int sayi;
		while(secim!= 0) 
		{
			System.out.println("1-ekle");
			System.out.println("2-çıkar");
			System.out.println("3-en üstekini göster");
			System.out.println("4-yazdır");
			System.out.println("0-çıkış");
			System.out.println("seçiminiz"); 
			secim=scanner.nextInt();
			
			switch(secim) 
			{
			case 1: System.out.println("sayı:"); sayi=scanner.nextInt();
			liste.push(sayi);break;
			case 2: liste.pop();break;
			case 3: liste.topG();break;
			case 4:liste.print();break;
			case 0: System.out.println("çıkış yaptınız"); break;
			default: System.out.println("hatalı giriş 0 4 arası seçin");
			}
		}

	}

}
