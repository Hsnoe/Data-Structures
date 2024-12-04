import java.util.Scanner;

public class deneme1 {
	
	node1 head=null;
	node1 tail=null;
	
	node1 tmp=null;
	node1 tmp2=null;
	
	int no;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	void ekle() 
	{
		System.out.println("öğrenci bilgi sistemine hoş geldiniz öğrenci bilgilerini giriniz :");
		System.out.println("öğrenci no : " );  no= scanner.nextInt();
		
		System.out.println("öğrenci adı : "); ad = scanner.nextLine();
		System.out.println("soyadı : "); soyad = scanner.nextLine();
		System.out.println("vize : "); vize= scanner.nextInt();
		System.out.println("final : "); fin=scanner.nextInt();
		
		System.out.println("ekleme işlemi tamamlandı..");
		
		node1 eleman = new node1(no,ad,soyad,vize,fin);
		
		if(head ==null) 
		{
			head=eleman;
			tail=eleman;
			System.out.println("liste oluşturuldu ilk öğrenci eklendi.");
		}
		else 
		{
			eleman.next=head;
			head=eleman;
			System.out.println("öğrenci listeye eklendi.");
			
		}
		
		
		
		
	}

	
	
	void sil() 
	{
		if(head==null)
			System.out.println("liste boş silinecek öğrenci yok..");
		else 
		{
			
		}
	}
}
