
public class BagliListe {
	
	
	Node head =null;
	Node tail =null;
	
	void basaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head ==null) {
			
			head =eleman;           //listede eleman oksa direk head ve tail eleman olur
			tail=eleman;
		}
		else {
			
			eleman.next =head;        //listede eleman varsa eleman başa eklenir ilerisi head olur headin gerisi prev olur yeni ehad değerim eleman olur
			head.prev =eleman;
			head=eleman;
		}
	}
	
	
	void sonaEkle(int data) {
		Node eleman = new Node(data);
		
		if(head ==null) {
			
			head =eleman;
			tail=eleman;
		}
		else {
			
			tail.next=eleman;            //sona eklemede tailin nexti eklediğim eleman olur elemanın previ tail olur yeni tail eleman olur
			eleman.prev =tail;
			tail=eleman;
			
		}
	}
	
	
	void arayaEkle(int indis,int data) {       //araya eklede bir indis belirledim nereye ekliyeceğimi
		Node eleman = new Node(data);
		
		if(head ==null) {            //ilk durum listede eleman yoksa direk head tail eklendi
			
			head =eleman;
			tail=eleman;
		}
		else if(head != null && indis ==0){      // ikinci durum listede birden fazla eleman var ama ilk indise ekelemek istiyorum
			
			eleman.next=head;
			head.prev = eleman;         //ekledim
			head = eleman;
		}
		else{
			int n=0;
			Node tmp=head;            // üçüncü durum araya ekleme direk 
			while(tmp !=null) {
				
				tmp=tmp.next;      //dolaşıyorum
				n++;
			}
			tmp=head;
			
			if(indis>n) {                //indis değerim n den büyükse son elemana eklicem
				tail.next=eleman;
				eleman.prev=tail;
				tail=eleman;
			}
			else {
				int i =0;
				while(i!=indis) {
					
					tmp=tmp.next;
					i++;
				}
				
				eleman.prev=tmp.prev;
				tmp.prev.next=eleman;
				
				
				eleman.next=tmp;
				tmp.prev=eleman;
				
				
						
			}
			
		}
	}
	
	void bastanSil() {
		
		if (head!=null) {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				head=head.next;
				head.prev=null;
				
			}
		}
	}
	
	
	void sondanSil() {
		
		if (head!=null) {
			if(head.next==null) {
				head=null;
				tail=null;
			}
			else {
				tail=tail.prev;
				tail.next=null;
				
			}
		}
	}
	
	void aradanSil(int indis) {
		
		if (head ==null) {
			System.out.println("liste boş");
		}
		else if(head.next==null && indis ==0) {
			head= null;
			tail= null;	
		}
		else if(head.next !=null && indis <=0) {
			head=head.next;
			head.prev=null;
		}
		else if(head.next !=null && indis <=0 ) {
			
		}
		else {
			
			int n =0;
			Node tmp = head;
			while(tmp!=null) {                  //dönme işlemi burası
				
				n++;
				tmp=tmp.next;
			}
			
			if (indis >=(n-1)) {
				
				tail=tail.prev;
				tail.next=null;
				
			}
			else {
				int i =0;
				tmp=head;
				while(indis >i) {
					
					i++;
					tmp=tmp.next;
					
				}
				tmp.next.prev=tmp.prev;
				tmp.prev.next=tmp.next;
				
				
			}
		}
	}
	
	
	void yazdır() {
		
		Node tmp = head;            //tmp boş değiişken atadım head değeri verdim
		System.out.print("bas ->");
		while (tmp != null) {             // tmp baştan başladı sonda null görene kadar devam tti
			
			System.out.print(tmp.data+" ->");       // data değerlerini yazdırdı
			tmp=tmp.next;
		}
		System.out.println("son ->");
	}
	
	
	void sondanyazdır() {
		
		Node tmp = tail;            //tmp boş değiişken atadım tail değeri verdim
		System.out.print("son ->");
		while (tmp != null) {             // tmp tailden başladı başa kadar geri döndü
			
			System.out.print(tmp.data+" ->");       // data değerlerini yazdırdı prev komutu ile tersten geldi
			tmp=tmp.prev;
		}
		System.out.println("bas ->");
	}


}
