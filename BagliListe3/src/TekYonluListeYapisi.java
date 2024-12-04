
public class TekYonluListeYapisi {
	Node head = null;
	Node tail = null;
	
	
	void basaekle(int x ) {
		
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null ) {
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("liste yapısı oluşturuldu ilk eleman eklendi..");
		}
		
		else {
			eleman.next = head;
			head = eleman;
			System.out.println("başa eeman eklendi..");
		}
	}
	
	
	void sonaaekle(int x ) {
		
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null ) {
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("liste yapısı oluşturuldu ilk eleman eklendi..");
		}
		
		else {
			eleman.next = null;
			tail.next = eleman; //son düğüme ekleme yaptım
			tail = eleman;  // son düğümü günelledim
			System.out.println("sona eleman eklendi");
		}
	}
	
	
	void arayaEkle(int indis , int x ) {
		
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null && indis == 0 ) { // liste boş ve 0. indise yerleştir derse
			eleman.next = null;
			head = eleman;
			tail = eleman;
			System.out.println("liste yapısı oluşturuldu ilk eleman eklendi..");
		}
		else if(head != null && indis == 0) {         //listte boş değil 0. indise yerleştir derse
			eleman.next = head;
			head = eleman;
			System.out.println("0. indise eleman eklendi eklendi..");
			
			
		}
		
		else {                             // listenin son indisine eleman ekleme kısmı
			
			int n= 0;          //listeyi dolaşmak için bir n değeri 0 belirledimm
			Node tmp = head;         //tmp diye başlangıcı ilk değer olan tmp ler atadım
			Node tmp2 = head;
			
			while( tmp.next != null) {  
				
				n++;              // amacımız n i bulmak   
				tmp2 = tmp;       // tmp2 sondan bir önceki elemanı gösterir bu ikisinin arasına eklemeke için
				tmp = tmp.next;  // tmp son değeri gösterir tail    bu 2 satırda listeyi dolanıyorum eleman sayısınıda buluyorum
			}
			if ( n == indis) {
				tmp2.next = eleman;           // elemanımı 2 sinin arasına ekliyorum
				eleman.next = tmp;
				System.out.println("eleman eklendi");
				
			}
			else {         // son durum artık, baş son özel durumu bitti ve sadece standart araya ekleme yapıcağız.
				tmp = head;
				tmp2 = head; // tmp lerimi tekrardan o ladım
				
				int i= 0;       
				while (i != indis) {   // i m belirtilen indise eşit olduğunda durcak
					tmp2 = tmp;  
					tmp = tmp.next; // ekleyeceğim elemanı tmp2 nin önüne tmp min arkasını buldum dolanarak while ile
					i++;
					
				}
				tmp2.next = eleman;  // tmp2 min sonrasına elemanımı ekledım
				eleman.next = tmp;   // elemandan sonra da tmp mi koydum
				System.out.println(indis + ". sıraya eleman yerleştirildi..");
				
				
				
			}
			
			
			
			
			
		}
	}

	
	
	
	void bastanSil() {
		
		if (head == null) {            
			System.out.println("liste booş");
		}
		
		else if (head.next == null) {   //listede tail dolu ise yani 1 elemandan sonası varsa
			head =null;
			tail=null;
			System.out.println("son eleman da silindi");
		}
		else {
			head = head.next;      // liste doluysa baştan silme burası baştan sonrakini başa atarsan baştaki boşa düşer.
			System.out.println("baştaki eleman silindi");
		}
	}
	
	void sondanSil() {
		
		if (head == null) {            
			System.out.println("liste booş");
		}
		
		else if (head.next == null) {   //listede tail dolu ise yani 1 elemandan sonası varsa
			head =null;
			tail=null;
			System.out.println("son eleman da silindi");
		}
		else {
			Node tmp1= head;
			Node tmp = head;
			
			while(tmp.next != null) {
				
				tmp1= tmp;              // bir sonraki düğüme gçmeden önce tmp değerini tmp1 e veriyor , tmp1 son değeri alr
				tmp=tmp.next;           // son düğüme geçer nulu görür durur
			}
			
			tmp1.next= null;
			tail = tmp1;
			System.out.println("sondan eleman silindi..");
			
		}
	}

	void aradanSil(int indis) {
		
		if (head == null) {
			System.out.println("listem boş silinecek bir şey yok ");
		}
		else if (head.next ==null && indis == 0) {
			head =null;                                   //listede tek bir eleman var onu da böyle sildik
			tail =null;
			System.out.println("listede kalan son elemanda silindi");
			
		}
		else if(head.next != null && indis ==0 ) {  // listede birden fazla eleman var ilkkini silmek istediim
			head = head.next;            // ilkini silme komutu
			System.out.println("baştaki eleman silindi..");
		}
		else {
			
			int i= 0;
			Node tmp = head;   
			Node tmp2 = head;
			
			while(tmp != null) {
				
				i++;
				tmp2 = tmp;             //tmp2m de tailden önceki son düğüm onu tuttum
				tmp = tmp.next;        //tmpm benim tail değerim ona ulaşıp silmem gerek
			}
			if(i== indis) {
				tmp2.next = null;
				tail = tmp2;
				System.out.println("listede ki son sıradaki eleman silindi");
				
			}
			
			else {
				
				 tmp =head;
				 tmp2 = head;;
				 int j=0;
				 
				 while ( j!= indis) {
					 
					 tmp2 = tmp;         // burda indisimin belirttiği yere kadar gidip önceki elemanı tmp2 ye silinecek indisi tmp ye atadım
					 tmp = tmp.next;
					 j++;
					 
				 }
				 
				 tmp2.next = tmp.next;    //temp ortada kaldı silinecek
				 System.out.println("aradaki nesne silindi");
				
			}
		}
	}
	
	
	
	void yazdir() {
		
		if (head == null) {
			System.out.println("liste boşş");
		}
		
		else {
			Node tmp = head;
			System.out.print("baş ");
			while (tmp!= null) {
				System.out.print(tmp.data + "->");
				tmp = tmp.next;
				
				
			}
			System.out.print("son.");
			
		}
	}
	
	
	
	
	

}
