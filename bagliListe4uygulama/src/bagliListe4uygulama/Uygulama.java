package bagliListe4uygulama;

import java.util.Scanner;

public class Uygulama {
	public static void main(String[] args) {
		
		int secim=-1;
		
		ogrListe bilbolümü = new ogrListe();
		Scanner scanner = new Scanner(System.in);
		
		while(secim != 0) {
			
			System.out.println();
			System.out.println("Bilgisayar bölümü öğrenci kayıt uygulması");
			System.out.println("1- yeni kayıt");
			System.out.println("2- kayıt silme");
			System.out.println("3- kayıtları listele");
			System.out.println("4- en başarılı öğrenciyi göster");
			System.out.println("0- çıkış");
			System.out.println("seçiniz :");
			secim = scanner.nextInt();
			
			
			if(secim ==1)
				bilbolümü.ekle();
			else if (secim==2)
				bilbolümü.sil();
			else if (secim==3)
				bilbolümü.yazdır();
			else if (secim ==4)
				bilbolümü.enbasariliogrenci();
			else if (secim==0)
				System.out.println("çıkıış yaptınız..");
			else
				System.out.println("hatalı giriş yaptınız [0;4] arası giriniz");
			
			
		}
	}

}
