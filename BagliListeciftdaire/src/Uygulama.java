import java.util.Scanner;

public class Uygulama {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		BagliListe liste = new BagliListe();
		int secim =1;
		
		while(secim!=0)
		{
			System.out.println("1- basaekle");
			System.out.println("2- sonaekle");
			System.out.println("3- arayaekle");
			System.out.println("4- bastansil");
			System.out.println("5- sondansil");
			System.out.println("6- aradansil");
			System.out.println("7- tersten yazdır");
			System.out.println("0- cıkış");
			System.out.println("seçiminiz;;"); secim=scanner.nextInt();
			
			
			switch(secim) 
			{
			case 1: liste.basaekle(); break;
			case 2: liste.sonaekle(); break;
			case 3: liste.arayaekle(); break;
			case 4: liste.bastanSil(); break;
			case 5: liste.sondanSil(); break;
			case 6: liste.aradanSil(); break;
			case 7: liste.terstenYazdır(); break;
			case 0: System.out.println("çıkış yapttınız.."); break;
			default: System.out.println("yanlış seçim yaptınız 0 ile 4 arası seçin");break;
			
				
			}
			liste.yazdır();
			
		}
	}
	

	

}
