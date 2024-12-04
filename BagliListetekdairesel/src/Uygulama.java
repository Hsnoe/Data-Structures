import java.util.Scanner;

public class Uygulama {
	public static void main(String[] args) {
		BagliListe liste=new BagliListe();
		Scanner scanner = new Scanner(System.in);
			int secim=-1;
		 
			while(secim!=0) {
				
				System.out.println("1-basa ekle");
				System.out.println("2-sona ekle");
				System.out.println("3-araya ekle");
				System.out.println("4-bastansil ekle");
				System.out.println("5-sondansil ekle");
				System.out.println("6-aradansil ekle");
				System.out.println("0-çıkış");
				System.out.println("seciminiz..");
				
				secim=scanner.nextInt();
				scanner.nextLine();
				
				switch(secim) {
				
				case 1:liste.basaEkle();break;
				case 2:liste.sonaEkle();break;
				case 3:liste.arayaEkle();break;
				
				case 0:System.out.println("çıkıkşş yaptınız"); break;
				default: System.out.println("hatalı seçim yaptınız 0 ile 6 arası seçin");
				
				}
				liste.yazdır();
				
			}
		}
	}

		
		
		




