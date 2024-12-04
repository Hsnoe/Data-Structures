import java.util.Scanner;

public class BagliListe {
	Scanner scanner = new Scanner(System.in);
	
	MüsteriNode head=null;
	MüsteriNode tail=null;
	
	int id;
	String ad;
	String soyad;
	String tel;
	String adres;
	String urun;
	
	
	void ekle() {
		
		System.out.println("müiteri bilgilerini giriniz; ");
		System.out.println("numara giriniz:"); id=scanner.nextInt();
		System.out.println("ad giriniz:");     ad=scanner.nextLine();
		System.out.println("soyad giriniz:");  soyad=scanner.nextLine();     //ekleyeceğim elemanın değerlerini aldım
		System.out.println("tel giriniz:");    tel=scanner.nextLine();
		System.out.println("adres giriniz:");  adres=scanner.nextLine();
		System.out.println("urun giriniz:");   urun=scanner.nextLine();
	
		MüsteriNode eleman = new MüsteriNode(id,ad,soyad,tel,adres,urun);   //eleman nesnesini oluşturdum ve değerlerini atadım
		
		if (head ==null) {    // liste  yapısı oluşturuldu ilk eleman eklendi 
			head=eleman;
			tail=eleman;
		}
		else {
			eleman.next=head;
			head.prev=eleman;                    // listeye kayıt işlemi yapıldı
			head=eleman;
			System.out.println(id + "numaralı müşteri kayıt edildi..");
			
		}
	}
	
	
	void sil() {
		
		if (head==null) {  
			System.out.println("liste boşş..");                  //liste boş eleman yok 
		}
		
		
		else {
			
		
			System.out.println("silinecek müşteri id si girin ...;");id=scanner.nextInt();
																		
			if(head.next== null && head.id==id) {           // listede bir elemn var o da silindi
				head=null;
				tail=null;
				System.out.println(id +"numralı id silindi..");
				
			}
			else if(head!=null && head.id==id) {     //listede birden fazla eleman var ama head yani ilk değer silinicek
				
				head=head.next;
				head.prev=null;
				System.out.println(id +"numarali müşteri silindi..");
				
				
			}
			else if(tail.id==id) {    //lsitede sondan eleman sildik
				tail=tail.prev;
				tail.next=null;
				System.out.println("numaralıı müşteri silindi");
			}
			
			
			
		}
	}

}
