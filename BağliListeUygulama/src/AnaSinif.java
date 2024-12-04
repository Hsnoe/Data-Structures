import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		BagliListe list = new BagliListe();
		
		int secim=-1;
		Scanner scanner = new Scanner(System.in);
		
		while(secim!=0) 
		{
			System.out.println("liste ugulaması ");
			System.out.println("1- lsteye ekle  : ");
			System.out.println("2- listeden sil :");
			System.out.println("3- liste yaz :");
			System.out.println("4- eleman sayısı :");
			System.out.println("0- çıkış :");
			System.out.println("isteiğinz komutu giriniz :");
			secim=scanner.nextInt();
			
			if(secim==1) 
			{
				list.elemanekle();
			}
			else if( secim==2) 
			{
				list.sil();
			}
			else if(secim==3) 
			{
				list.listeyazdir();
			}
			else if(secim==4) 
			{
				list.elemansayisi();
			}
			else if(secim ==0) 
			{
				System.out.println("çıış yaptınız ");
			}
			else 
			{
				System.out.println("yanlış seçim 0-4 aralığı giriniz ");
			}
			
			
			
		}
		
		
	}

}
