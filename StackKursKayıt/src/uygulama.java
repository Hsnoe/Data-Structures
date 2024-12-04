import java.util.Scanner;

public class uygulama {
	public static void main(String[] args) {
		
		kursliste list = new kursliste(5);
		
		Scanner scanner = new Scanner(System.in);
		int secim=-1;
		
		while(secim!=0) 
		{
			System.out.println("yapacağınız işlemi seçin");
			System.out.println("1-kursa kayıt işlemi  :");
			System.out.println("2-kurstan silme işlemi :");
			System.out.println("3-öğrenci bilgilerini yazdırma işlemi :");
			System.out.println("4-en son kayıtı göster :");
			System.out.println("0-çıkış işlemi ");
			secim= scanner.nextInt();
			
			if(secim==1)
				list.ekle();
			else if(secim==2)
				list.sil();
			else if(secim==3)
				list.yazdır();
			else if(secim==4)
				list.ensonkayıt();
			else if(secim==0)
				System.out.println("çıkış yapıldı");
			else
				System.out.println("04 aralığında seçiniz ");
			
			
			list.yazdır();
			
		}
		
	}

}
