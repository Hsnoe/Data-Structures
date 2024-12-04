import java.util.Scanner;

public class BagliListe {
	
	Scanner scanner = new Scanner(System.in); 
	Node head=null;
	Node tail=null;
	Node tmp=null;
	Node tmp2=null;
	int data;
	int indis;
	
	
	void basaekle()
	{
		System.out.println("data:"); data = scanner.nextInt();		
		Node eleman = new Node(data);
		
		if(head==null) 
		{
			head=eleman;
			tail=eleman;
			
			head.next=tail;
			tail.prev=head;
			head.prev=tail;
			tail.next=head;
		}
		else 
		{
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
			tail.next=head;
			head.prev=tail;
		}
		
	}
	
	void sonaekle()
	{
		System.out.println("data:"); data = scanner.nextInt();		
		Node eleman = new Node(data);
		
		if(head==null) 
		{
			head=eleman;
			tail=eleman;
			
			head.next=tail;
			tail.prev=head;
			head.prev=tail;
			tail.next=head;
		}
		else 
		{
			tail.next=eleman;
			eleman.prev=tail;
			
			tail=eleman;
			
			tail.next=head;
			head.prev=tail;
		}
		
	}
	
	void arayaekle()
	{
		System.out.println("data:"); data = scanner.nextInt();		
		System.out.println("indis:"); indis= scanner.nextInt();
		Node eleman = new Node(data);
		
		if(head==null) 
		{
			head=eleman;
			tail=eleman;
			
			head.next=tail;
			tail.prev=head;
			head.prev=tail;
			tail.next=head;
		}
		else if(indis==0) 
		{
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
			tail.next=head;
			head.prev=tail;
		
		}
		else {
			tmp=head;
			tmp2=tmp;
			int n=0;
			
			while(tmp!=tail) 
			{
				n++;
				tmp=tmp.next;
			}
			tmp=head;
			int i=0;
			while(i<indis)
			{
				tmp2=tmp;        // i dğerini tmp tutar bir öncekii tmp2 tutar
				tmp=tmp.next;
				i++;
			}
			
			if( n<indis)  //sona ekleme işlemi yapacağız listede 5 eleman varsa 6. elemana ekleme 
			{
				tail.next=eleman;
				eleman.prev=tail;
				
				tail=eleman;
				
				tail.next=head;
				head.prev=tail;
			}
			else 
			{
				tmp2.next=eleman;
				eleman.prev=tmp2;
				
				eleman.next=tmp;
				tmp.prev=eleman;
				
				
			}
		}
		
	}
	
	void yazdır() {
		if (head==null)
			System.out.println("liste boşş");
		
		else 
		{
			tmp=head;
			System.out.print("baş  ->");
			while (tmp!=tail) {
				System.out.print(tmp.data +" ->");
				tmp=tmp.next;
			}
			System.out.println(tmp.data+" -> son.");
		}
	}
	
	void terstenYazdır() {
		if (head==null)
			System.out.println("liste boşş");
		
		else 
		{
			tmp=tail;
			System.out.println("son  ->");
			while (tmp!=head) {
				System.out.print(tmp.data +" ->");
				tmp=tmp.prev;
			}
			System.out.println(tmp.data+" -> bas.");
		}
	}
	
	void bastanSil() {
		
		if(head==null)
			System.out.println("liste boşş");
		
		else if(head==tail) 
		{
			head=null;
			tail=null;
		}
		else 
		{
			head=head.next;
			head.prev=tail;
			tail.next=head;
			
		}
	
		
		
	}
	
	void sondanSil() {
		
		if(head==null)
			System.out.println("liste boşş");
		
		else if(head==tail) 
		{
			head=null;
			tail=null;
		}
		else 
		{
			tmp =head;
			while(tmp.next!=tail) 
			{
				tmp=tmp.next;
			}
			tail=tmp;
			tail.next=head;
			head.prev=tail;
		}
	
		
		
	}
	
	void aradanSil() {
		
		if(head==null)
			System.out.println("liste boşş");
		
		else 
		{
			System.out.println("indis:"); indis=scanner.nextInt();
			
			if(indis==0 && head==tail)
			{
				head=null;
				tail=null;
			}
			else if(indis==0 && head!=tail)
			{
				head=head.next;
				head.prev=tail;
				tail.next=head;
			}
			else 
			{
				int n=0;
				tmp=head;
				while(tmp != tail) 
				{
					n++;
					tmp=tmp.next;
				}
				
				if(indis>=n)   //sondan siil işlemi
				{
					tail=tmp;
					tail.next=head;
					head.prev=tail;
				}
				else 
				{
					tmp=head;
					tmp2=tmp;
					int i=0;
					
					while(i<indis) 
					{
						i++;
						tmp2=tmp;
						tmp=tmp.next;
					}
					
					tmp2.next=tmp.next;
					tmp.next.prev=tmp2;
					
					
				}
				
			}
			
		}
		
	
	
		
		
	}

}

	
