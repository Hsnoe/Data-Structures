package quequePideci;

import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secim = -1,n;
		
		System.out.println("kuyruk yapısının eleman sayısı :"); n=scanner.nextInt();
		
		queuepideYapisi kuyruk = new queuepideYapisi(n);
		
		while(secim!=0)
		{
			System.out.println("1-yeni müşteri ekle");
			System.out.println("2-satış yap");
			System.out.println("3-bekleyen müşteriler");
			System.out.println("4-toplam gelir");
			System.out.println("0-çıkış ");
			System.out.print("seçiminiz;");
			secim=scanner.nextInt();
			
			switch(secim) 
			{
			case 1: kuyruk.enQueue(); break;
			case 2: kuyruk.deQueue();break;
			case 3: kuyruk.print();break;
			case 4: System.out.println("toplam gelir : " + kuyruk.toplamGelir); break;
			case 0: System.out.println("çıkı yaptınız: "); break;
			default: System.out.println("hatalı giriş yaptınız 0-4 aralığı");
			}
		}
		

	}

}
