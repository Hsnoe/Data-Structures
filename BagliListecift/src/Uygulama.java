import java.util.Scanner;

public class Uygulama {
	public static void main(String[] args) {
		
		BagliListe b1 = new BagliListe();
		Scanner scanner = new Scanner(System.in);
		
		int secim=-1,sayi,indis;
		
		while(secim !=0) {
			System.out.println("1-basa ekle:");
			System.out.println("2-sona ekle:");
			System.out.println("3-arayaekle ekle:");
			System.out.println("4-sondan başa yazdır ekle:");
			System.out.println("5-baştan sil:");
			System.out.println("6-sondan sil;");
			System.out.println("7-aradan sil");
			System.out.println("0-çıkış:");
			System.out.println("seçiminiz:");
			secim = scanner.nextInt();
			
			if(secim == 1) {
				System.out.println("sayi :");
				sayi =scanner.nextInt();
				b1.basaEkle(sayi);
			}
			
			else if(secim == 2) {
				System.out.println("sayi :");
				sayi =scanner.nextInt();
				b1.sonaEkle(sayi);
			}
			
			else if(secim == 3) {
				System.out.println("indis :");
				indis =scanner.nextInt();
				
				System.out.println("sayi :");
				sayi =scanner.nextInt();
				b1.arayaEkle(indis, sayi);
			}
			
			else if (secim==4)
				b1.sondanyazdır();
			
			else if(secim == 5) {
				b1.bastanSil();
			}
			
			else if(secim == 6) {
				b1.sondanSil();
			}
			else if(secim==7) {
				System.out.println("indiis:");
				indis=scanner.nextInt();
				b1.aradanSil(indis);
				
			}
			
			b1.yazdır();
			

		}
		
		
		
	}

}
