import java.util.Scanner;


public class Uygulama {
	public static void main(String[] args) {
		
		TekYonluListeYapisi tylist = new TekYonluListeYapisi();
		
		Scanner scanner = new Scanner(System.in);
		int secim = 1;
		int sayi,indis;
		
		while(secim != 0) {
			System.out.println();
			System.out.println("1:başa  ekle");
			System.out.println("2:sona  ekle");
			System.out.println("3:araya ekle");
			System.out.println("4:baştan sil");
			System.out.println("5:sondan sil");
			System.out.println("6:aradan sil");
			System.out.println("0:çıkış");
			System.out.println("yapacağınız işlemi seçiniz :");
			secim = scanner.nextInt();
			
			
			
			if(secim == 1) {
				System.out.println("sayi;");
				sayi = scanner.nextInt();
				tylist.basaekle(sayi);
				
				
			}
			else if(secim == 2) {
				System.out.println("sayi:");
				sayi=scanner.nextInt();
				tylist.sonaaekle(sayi);
			}
			
			else if(secim == 3) {
				System.out.println("sayi:");
				sayi=scanner.nextInt();
				System.out.println("kaçıncı indise yerleştirelim");
				indis =scanner.nextInt();
				tylist.basaekle(sayi);
			}
			else if(secim == 4) {
				tylist.bastanSil();
			}
			else if(secim == 5) {
				tylist.sondanSil();
			}
			else if(secim == 6) {
				System.out.println("kaçıncı indisi silelim");
				indis =scanner.nextInt();
				tylist.aradanSil(indis);
			}
			else if (secim ==0 )
				System.out.println("çıkış yaptınız");
			
			else {
				System.out.println("hatalı giriş yaptınız");
			}
			
			tylist.yazdir();
		}
		
		
		
		
		
	}

}
