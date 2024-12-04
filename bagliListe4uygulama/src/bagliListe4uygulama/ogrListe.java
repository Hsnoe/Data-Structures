package bagliListe4uygulama;

import java.util.Scanner;

public class ogrListe {
	ogrNode head = null;
	ogrNode tail = null;
	ogrNode tmp = null;
	ogrNode tmp2 = null;
	
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin;
	double ortalama;
	String durum;
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	
	void ekle() {
		
		System.out.println("bilgisayar bölümüne kayıt olucak öğrenci bilgilerini giriniz:");
		System.out.println("numara:");
		numara = scanner.nextInt();
		
		System.out.println("ad:");
		ad = scanner.nextLine();
		
		System.out.println("soyad:");
		soyad = scanner.nextLine();
		
		System.out.println("vize:");
		vize = scanner.nextInt();
		
		System.out.println("final:");
		fin = scanner.nextInt();
		
		System.out.println("ekleme işlemi tamamlandı");
		
		
		
		ogrNode eleman = new ogrNode(numara, ad, soyad, vize, fin);
		
		
		if (head == null) {
			
			head = eleman;
			tail = eleman;
			System.out.println("bilgisayar bölümüne kayıt yapılacak öğrenci listesi oluşturuldu ve ilk öğrenci eklendi");
		}
		else {
			eleman.next =head;   //head in önüne elemanı ekledim.
			head = eleman;
			System.out.println(numara + " numaralı öğrenci bölüme kayıt edildi..");
		}
	}
	
	
	void sil() {
		if(head == null)
			System.out.println("listede eleman yok boş");
		
		else {
			
			System.out.println("silinecek öğrenciinin numarasını giriniz");
			numara = scanner.nextInt();
			
			if(numara == head.numara && head.next == null) {
				
				head = head.next;
				System.out.println(numara + "nuamralı öğrenci silindi");	
			}
			else {
				
				tmp=head;
				tmp2=head;
				
				while(tmp.next != null) {
					
					if(numara == tmp.numara) {
						
						tmp2.next =tmp.next;
						System.out.println(numara + "nuamralı öğrenci silindi");
						
					}
					
					tmp2=tmp;
					tmp = tmp.next;
				}
				
				if(numara == tmp.numara) {
					
					tmp2.next =null;
					tail = tmp2;             //son düğümü silmiş olduk while buraya girmedi oyüzden whilenın dışında kontrol ettik
					System.out.println(numara + "nuamralı öğrenci silindi");
			}
		}
	}

}

	
	void yazdır() {
		
		if(head == null) {
			System.out.println("liste boş..");
		}
		
		else {
			
			tmp = head;
			while(tmp != null) {
				
				System.out.println(tmp.numara +"numaralı öğreci bilgileri");
				System.out.println("*******************************");
				System.out.println("ad       :" + tmp.ad);
				System.out.println("soyad    :" + tmp.soyad);
				System.out.println("vize     :" + tmp.vize);
				System.out.println("final    :" + tmp.fin);
				System.out.println("ortalama :" + tmp.ortalama);
				System.out.println("durum    :" + tmp.durum);
				System.out.println("*******************************");
				tmp = tmp.next;
			}
			
		}
		
		
		}
	

	
	void enbasariliogrenci() {
	
	if(head == null) {
		System.out.println("liste boş..");
	}
	
	else {
		
		tmp = head;
		double buyuk = tmp.ortalama;
		while(tmp != null) {
			
			if (buyuk<tmp.ortalama) {
				
				buyuk =tmp.ortalama;
				
				ad =tmp.ad;
				soyad =tmp.soyad;
				vize =tmp.vize;
				fin =tmp.fin;
				ortalama=tmp.ortalama;
				durum=tmp.durum;
				
			}
				
				
			tmp = tmp.next;
		}
		
		System.out.println(tmp.numara +"numaralı öğreci bilgileri");
		System.out.println("*******************************");
		System.out.println("ad       :" + tmp.ad);
		System.out.println("soyad    :" + tmp.soyad);
		System.out.println("vize     :" + tmp.vize);
		System.out.println("final    :" + tmp.fin);
		System.out.println("ortalama :" + tmp.ortalama);
		System.out.println("durum    :" + tmp.durum);
		System.out.println("*******************************");
		
	}
	
	
	}
}



