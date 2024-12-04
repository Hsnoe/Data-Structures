import java.util.Scanner;
public class BagliListe {
	Scanner scanner = new Scanner(System.in);
	Node head=null;
	Node tail=null;
	
	
	void basaEkle() {
		
		int data;
		
		System.out.println("data: ");
		data=scanner.nextInt();
		Node eleman=new Node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else {
			eleman.next=head;
			head=eleman;
			tail.next=head;
		}
					
		
	}
	
	void bastanSil() {
		if(head==null)
			System.out.println("liste boşş");
		else if(head==tail) {
			head=null;
			tail=null;
			
		}
		else {
			head=head.next;
			tail.next=head;
		}
		
	}
	void sondanSil() {
		if(head==null)
			System.out.println("liste boşş");
		else if(head==tail) {
			head=null;
			tail=null;
			
		}
		else {
			Node tmp=head;
			
			while(tmp.next!=tail) {
				
				tmp=tmp.next;
				
			}
			tail=tmp;
			tail.next=head;
			
		}
		
	}
		void aradanSil() {
			
		if(head==null)
			System.out.println("liste boşş");
		else if(head==tail) 
		{
			head=null;
			tail=null;
		}
		else {
	int indis,n=0;
			
			System.out.println("indis: ");
			indis=scanner.nextInt();
		
			Node tmp=head;
			Node tmp2=tmp;
			
			while(tmp!=tail) {
				
				tmp=tmp.next;
				n++;
			}
			n++;
			tmp=head;
			int i=0;
			while(i<indis) 
			{
				i++;
				tmp2=tmp;
				tmp=tmp.next;
			}
			tmp2.next=tmp.next;
			
		
		}
		
	}
	
	void sonaEkle() {
		
		int data;
		
		System.out.println("data: ");
		data=scanner.nextInt();
		Node eleman=new Node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else {
			tail.next=eleman;
			tail=eleman;
			tail.next=head;
			
		}
					
		
	}
	
	void arayaEkle() {
		
		int data;
		int indis;
		
		System.out.println("data: ");
		data=scanner.nextInt();
		System.out.println("indis;");
		indis=scanner.nextInt();
		
		Node eleman=new Node(data);
		if(head==null) {
			head=eleman;
			tail=eleman;
			tail.next=head;
		}
		else if(indis==0) {
			tail.next=eleman;
			tail=eleman;
			tail.next=head;
			
		}
		else {
			int n=0;
			Node tmp=head;
			Node tmp2=tmp;
			while(tmp!=tail) {
				tmp=tmp.next;
				n++;
			}
			n++;
			if(indis>=(n)) {
				tail.next=eleman;
				tail=eleman;
				tail.next=head;
			}
			else {
				tmp=head;
				tmp2=tmp;
				int i=0;
				while(i<indis) {
					i++;
					tmp2=tmp;
					tmp=tmp.next;
				}
				tmp2.next=eleman;
				eleman.next=tmp;
			}
		}
		
					
		
	}
	
	void yazdır() {
		if(head==null)
			System.out.println("liste boş..");
		
		else{
			Node tmp=head;
			System.out.print("bas ->");
		
			while(tmp!=tail) {
				System.out.println(tmp.data+" -> ");
				tmp=tmp.next;
			}
			System.out.print(tmp.data+"son");
			
		}
		
	}
		
		
	
	
	
	
				
}
