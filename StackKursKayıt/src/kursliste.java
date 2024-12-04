import java.util.Scanner;

public class kursliste {
	
	
	int kontenjan;
	int sayac;
	kursnode top;
	public kursliste(int kontenjan) {
		this.kontenjan = kontenjan;
		int sayac=0;
		top=null;
	}
	
	int tc;
	String ad;
	String soyad;
	String mezunbolum;
	
	Scanner scanner = new Scanner(System.in);
	
	void ekle()  //push() 
	{
		
		System.out.println("kayıt edilecek öğrenci bilgileri giriniz : ");
		System.out.println("öğtenci tc si  :");    tc= scanner.nextInt();
		System.out.println("öğrenci adı    :");    ad= scanner.nextLine();
		System.out.println("öğrenci soyadı :");    soyad=scanner.nextLine();
		System.out.println("öğrenci mezunbolum :"); mezunbolum=scanner.nextLine();
		
		kursnode eleman=new kursnode(tc,ad,soyad,mezunbolum);
		
		if(isFull()) 
		{
			System.out.println("kurs kontenjanı dolu kayıt almıyoruz :");
		}
		else 
		{
			
			if(isEmpty()) 
			{
				top=eleman;
				System.out.println("kursumuza ilk kayıt yapıldı.");
			}
			else 
			{
				eleman.ileri=top;
				top=eleman;
				System.out.println("yeni kayıt yapıldı.");
			}
			sayac++;
		}
		
	}

	void sil()   //pop() 
	{
		if(isEmpty()) 
		{
			System.out.println("kurrsta öğrenci yok silinecek bir şey yok.");
		}
		else 
		{
			System.out.println(top.tc + " numaralı kişi silindi..");
			top=top.ileri;
			
		}
		
		
	}
	
	
	void ensonkayıt() 
	{
		if(isEmpty())
			System.out.println("liste boş kayıtlı kişi yok");
		else 
		{
			System.out.println(top.tc +"en son kayıtlı kişinin numarası ");
		}
	}
	
	void yazdır() 
	{
		
		kursnode tmp= top;
		System.out.println("kurstaki öğrenci bilgileri");
		System.out.println("tcno\tad\tsoyad\tmezunbolum");
		System.out.println("************************");
		while(tmp!=null) 
		{
			System.out.print(tmp.tc);
			System.out.print(tmp.ad);
			System.out.print(tmp.soyad);
			System.out.print(tmp.mezunbolum);
			tmp=tmp.ileri;
		}
		
	}
	
	
	boolean isFull() {
		return kontenjan==sayac;
	}
	
	boolean isEmpty() 
	{
		return sayac==0;
	}
	
	

}
