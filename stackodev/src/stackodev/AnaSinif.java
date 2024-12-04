package stackodev;

import java.util.Scanner;

public class AnaSinif {
	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		stacklinkedlist stacklist = new stacklinkedlist(5);
		
		int secim =-1 ;
		
		while(secim!= 0) 
		{
			System.out.println(" 1-yığına ekle:  ");
			System.out.println(" 2-yığından sil: ");
			System.out.println(" 3-yığın eleman sayısı: ");
			System.out.println(" 4- stack bilgileri yazdır : ");
			System.out.println(" 0- çıkış yapınız : ");
			System.out.println(" hangi işlemi yapmak isitorsunuz ");
			secim=scanner.nextInt();
			
			
			if(secim==1)
				stacklist.push();
			else if (secim==2)
				stacklist.pop();
			else if (secim==3)
				stacklist.elemansayisi();
			else if(secim==4)
				stacklist.yazdir();
			else if (secim==0)
				System.out.println("çıkış yaptınız ");
			else
				System.out.println("03 arası seçim yapınn");
	
			
		}
		
		stacklist.yazdir();
		
	}

}
