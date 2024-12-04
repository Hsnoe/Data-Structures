import java.util.Scanner;

public class kursliste2 {
	
	kursnode2 top;
	int sayac;
	int kontenjan;
	public kursliste2(int kontenjan) {
		this.kontenjan = kontenjan;
		sayac=0;
		top=null;
	}
	

	String no;
	String ad;
	String soyad;
	Scanner scanner = new Scanner(System.in);
	
	
	void ekle()  //push 
	{
		System.out.println("kursa kayıt yapacak kişilerin bilgleri:");
		System.out.println("no :"); no=scanner.nextLine();
		System.out.println("ad :"); ad=scanner.nextLine();
		System.out.println("soyad:"); soyad=scanner.nextLine();
		
		kursnode2 eleman = new kursnode2(no,ad,soyad);
		
		
		
		if(isFull()) 
		{
			System.out.println("kontenjan dolu öğrenci ekleyemiyorz.");
		}
		else 
		{
			eleman.next=top;
			top=eleman;
			System.out.println("ilk öğrenci kayıt oldu:");
		}
		sayac++;
		
	}
	
	void sil(  ) //pop
	{
		
		if(isEmpty()) 
		{
			System.out.println("kurs boş silinecek öğrenci yok.");
		}
		else 
		{
			System.out.println(top.no+ "lu kşşi  kaydı silindi ");
			top=top.next;
			
		}
		sayac--;
		
	} 
	
	
	void yazdır() 
	{
		kursnode2 tmp=top;
		if(isEmpty())
			System.out.println("kursta kimse yok yazdırılacak bir şey yok");
		else 
		{
			while(tmp!=null) 
			{
				System.out.println("kurstaki kişilerin bilgileri :");
				System.out.println(tmp.no+"--"+tmp.ad+"--"+tmp.soyad);
				tmp=tmp.next;
			}
		}
		
	}
	
	boolean isEmpty() 
	{
		return sayac==0;
	}
	
	boolean isFull() 
	{
		return kontenjan ==sayac;
	}
	

}
