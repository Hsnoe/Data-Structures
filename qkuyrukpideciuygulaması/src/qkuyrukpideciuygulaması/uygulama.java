package qkuyrukpideciuygulaması;

import java.util.Scanner;

public class uygulama {

	public static void main(String[] args) {
		pidekuyruk fırın = new pidekuyruk(20);
		Scanner scanner = new Scanner(System.in);
		
		int secim=-1;
		
		while(secim != 0) 
		{
			System.out.println("pideciye hoş geldiniz.... ");
			System.out.println("1- kuyruğa kişi ekle ");
			System.out.println("2- kuyruktan müşteri ayrılsın :");
			System.out.println("3- kuyruktakileri yazdır ");
			System.out.println("0- çıkış yap .");
			System.out.println("ne yapmak istersiniz:");
			secim = scanner.nextInt();
			
			if(secim==1)
				fırın.enQueue();
			else if(secim==2)
				fırın.deQueue();
			else if(secim==3)
				fırın.print();
			else if(secim ==0)
				System.out.println("çıkış yaptnız ");
			else
				System.out.println("03 arası giriniz ");

			
		}
		
		fırın.print();
		

	}

}
