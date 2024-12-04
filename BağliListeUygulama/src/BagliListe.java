import java.util.Scanner;

public class BagliListe {
	
	Eleman head =null ;
	Eleman tail=null;
	Eleman tmp=null;
	Eleman tmp2=null;
	
	
	String ad;
	String soyad;
	String dt;
	int tlno;
	
	Scanner scanner = new Scanner(System.in);
	
	void elemanekle() 
	{
		System.out.println("eleman ekleyin ::");
		System.out.println("listeye eklenecek yeni adı giriniz     :");  ad=scanner.nextLine();
		System.out.println("listeye eklenecek yeni soyadı giriniiz :");  soyad=scanner.nextLine();
		System.out.println("listeye eklenecek yeni doğum tarihini giriniz :"); dt=scanner.nextLine();
		System.out.println("listeye eklenecek yeni tlno giriniz : "); tlno=scanner.nextInt();
		
		
		Eleman eleman = new Eleman(ad,soyad,dt,tlno);
		
		
		if(head ==null) 
		{
			
			head=eleman;
			tail=eleman;
			System.out.println("ilk eleman eklendi");
		}
		else 
		{
			eleman.ileri=head;
			head=eleman;
			System.out.println("listeye eklendi..");
		}
		
		
	}
	
	
	void sil() 
	{
		if(head==null)
			System.out.println("liste boş silinecek bir şey yok");
		else 
		{
			System.out.println("silmek istediğiniz öğrenciin tlno sonu girin");
			tlno=scanner.nextInt();
			
			if(tlno ==head.tlno && head.ileri== null) 
			{
				head=null;
				tail=null;
				System.out.println("bir eleman silidni liste boşaldı");
				
				
			}
			else if(tlno== head.tlno && head.ileri !=null) {
				head=head.ileri;
				System.out.println("eleman silindi..");
			}
			else 
			{
				tmp=head;
				tmp2=head;
				
				while(tmp.ileri !=null) 
				{
					if(tlno==tmp.tlno) 
					{
						tmp2.ileri=tmp.ileri;
						System.out.println("silme işlemi tamamlandı..");
					}
					tmp2=tmp;
					tmp=tmp.ileri;
					
				}
				if(tlno==tmp.tlno) 
				{
					tmp2.ileri=null;
					tail=tmp2;
					System.out.println(tlno+ " elemanı silidni");
				}
			}
			
		}
		
	}

	void elemansayisi() 
	{
		if(head==null)
			System.out.println("liste boş eleman yok");
		else 
		{
			int sayac=0;
			tmp=head;
			
			while(tmp!=null) 
			{
				sayac++;
				tmp=tmp.ileri;
			}
			System.out.println("eleman sayıısı : " + sayac);
		}
	}
	
	
	void listeyazdir() 
	{
		if(head==null)
			System.out.println("liste boşş");
		else {
			Eleman tmp=head;
			while(tmp!=null) 
			{
				System.out.println(" eleman listesi : ");
				System.out.println("*********************");
				System.out.println("ad    :" + tmp.ad);
				System.out.println("soyad :" + tmp.soyad);
				System.out.println("dt    :" + tmp.dt);
				System.out.println("tlno  :" + tmp.tlno);
				System.out.println("***********************");
				
				tmp=tmp.ileri;
			}
		}
		
	}

}
