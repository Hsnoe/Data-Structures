package bagliListe4uygulama;

import java.util.Scanner;

public class liste1 {
	
	node1 head=null;
	node1 tail=null;
	
	node1 tmp=null;
	node1 tmp2=null;
	
	
	int no;
	String ad;
	String soyad;
	int vize;
	int finall;
	String durum;
	
	Scanner scanner = new Scanner(System.in);
	
	void ekle() 
	{
		System.out.println("öğrenci bilgilerini giriniz :");
		System.out.println("öğrenci no giriniz : "); no= scanner.nextInt();
		System.out.println("öğrenci adı girin : ");  ad = scanner.nextLine();
		System.out.println("öğrenci soyadı giirin : "); soyad = scanner.nextLine();
		System.out.println("vize notunu girin  : "); vize=scanner.nextInt();
		System.out.println("final notunu girin : "); finall = scanner.nextInt();
		
		node1 eleman = new node1(no,ad,soyad,vize,finall);
		
		if(head == null) 
		{
			head=eleman;
			tail=eleman;
			System.out.println("ilk öğrenci eklendi ");
		}
		
		else 
		{
			eleman.next=head;
			head=eleman;
			System.out.println("öğrenci eklendi");
			
		}
		
		
		
		
		
	}

	
	
	void sil() 
	{
		if(head==null) 
		{
			System.out.println("liste boş silinecek eleman yok..");
		}
		else 
		{
			System.out.println("silinecek kişinin no sunu girin :");
			no=scanner.nextInt();
			
			if(no == head.no && head.next==null) 
			{
				head=null;
				tail=null;
				System.out.println(no+ " numaralı kişi silindi liste de kimse kalmadı..");
				
			}
			else if(no==head.no && head.next!=null) 
			{
				head.next=head;
				System.out.println(no+ " numaralı kişi silindi..");
			}
			
			else 
			{
				tmp=head;
				tmp2=head;
				
				while(tmp.next!=null) 
				{
					if(no==tmp.no) 
					{
						tmp2.next=tmp.next;
						System.out.println(no+ "numaralı kişi sssslindi");
					}
					
					tmp2=tmp;
					tmp=tmp.next;
				}
				
				if(no==tmp.no) 
				{
					tmp2.next=null;
					tmp2=tail;
					System.out.println(no+ "son numaralı kişi sssslindi");
				}
				
				
				
			}
			
		}
		
	}
	
	
	void yazdır() 
	{
		
		if(head ==null)
			System.out.println("liste boş yazdırılacak bir şey yok .." );
		
		else 
		{
			tmp=head;
			
			while(tmp.next!=null) 
			{
				System.out.println("kişinin bilgileri :");
				System.out.println("****************");
				System.out.println("no :"+ tmp.no);
				System.out.println("ad :"+ tmp.ad);
				System.out.println("soyad :"+ tmp.soyad);
				System.out.println("vize :"+ tmp.vize);
				System.out.println("final :"+ tmp.finall);
				System.out.println("durum :"+ tmp.durum);
				tmp=tmp.next;
				
			}
			
		}
	}
}
