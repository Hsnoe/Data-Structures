package bagliListe4uygulama;

import java.util.Scanner;

public class uygulama1 {

	public static void main(String[] args) {
		
		liste1  liste = new liste1();
		
		int secim=-1;
		Scanner scanner = new Scanner(System.in);
		
		while(secim!=0) 
		{
			System.out.println("öğrenci bilgi sistemine hooş geldiniz :");
			System.out.println("1-öğrenci ekle :");
			System.out.println("2-öğrenci sil :");
			System.out.println("3-öğrenci bilgileri yazdır :");
			System.out.println("0-çıkış yap:");
			System.out.println("yapacağınız işlemi seçiniz ::");
			secim=scanner.nextInt();
			
			if(secim==1)
				liste.ekle();
			else if(secim==2)
				liste.sil();
			else if(secim==3)
				liste.yazdır();
			else if(secim==0)
				System.out.println("çıkış yaptınız ");
			else
				System.out.println("0 ile 3 arası değer giriniz ");
		}
		
		

	}

}
