import java.util.Scanner;

public class uygulama2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		kursliste2 list = new kursliste2(5);
		
	int secim=-1;
	
	while(secim!=0) 
	{
		System.out.println("1-ekle");
		System.out.println("2-sil");
		System.out.println("3-yazdır");
		System.out.println("0-çıkış");
		System.out.println("seçimniz:");
		secim=scanner.nextInt();
		
		if(secim==1)
			list.ekle();
		else if(secim==2)
			list.sil();
		else if(secim==3)
			list.yazdır();
		else if(secim==0)
			System.out.println("çıkış yapıldı");
		else
			System.out.println("04 aralığında seçiniz ");
		
		list.yazdır();
		
	}
	

	}

}
