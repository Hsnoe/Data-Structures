
public class ListeYapisi {
	Node head=null;
	Node tail=null;
	
	
	void basaekle(int x) 
	{
		Node eleman = new Node();   //eleman düğüm oluşturdum elemanın datasınıda atadım
		eleman.data=x;
		
		if(head==null) {
			System.out.println("liste oluşturuldu ilk eleman eklendi.");
			eleman.next=null;
			head=eleman;
			tail=eleman; 
		}
		else 
		{
			eleman.next=head;
			head=eleman;
			System.out.println("eleman başa eklendi..");
		}
		
	}
	
	
	
	void sonaekle(int x) 
	{
		Node eleman= new Node();
		eleman.data=x;
		
		if(head==null) {
			System.out.println("liste oluşturuldu ilk eleman eklendi.");
			eleman.next=null;
			head=eleman;
			tail=eleman;
		}
		else 
		{
			tail.next=eleman;
			tail=eleman;
			System.out.println("sona eleman eklendi");
			
		}
	}
	
	
	void arayaekle(int indis,int x) 
	{
		Node eleman= new Node();
		eleman.data=x;
		
		if(head==null && indis ==0 ) {
			System.out.println("liste oluşturuldu ilk eleman eklendi.");
			eleman.next=null;
			head=eleman;
			tail=eleman;
		}
		else if(head !=null && indis ==0) 
		{
			eleman.next=head;
			head=eleman;
			System.out.println("eleman başa eklendi..");
			
		}
		
		else 
		{
			int n=0;
			Node tmp=head;
			Node tmp2=head;
			while(tmp.next!=null) 
			{
				n++;
				tmp2=tmp;
				tmp=tmp.next;
				
			}
			
			if( n==indis) 
			{
				tmp2.next=eleman;
				eleman.next=tmp;
				System.out.println("eleman eklendi");
				
			}
			else 
			{
				tmp=head;
				tmp2=head;
				int i=0;
				
				while(i!=indis) 
				{
					tmp2=tmp;
					tmp=tmp.next;
					i++;
				}
				
				tmp2.next=eleman;
				eleman.next=tmp;
				System.out.println(indis + " inciidnise eleman eklendi..");
				
			}
			
		}
		
	}
	
	
	void bastansil() 
	{
		if(head==null)
			System.out.println("liste boş silinecek bir şey yok");
		else if( head.next==null) 
		{
			head=null;
			tail=null;
			System.out.println("tek eleman silindi boşaldı liste");
			
		}
		else 
		{
			head=head.next;
			System.out.println("baştaki eleman silindi");
		}
	}
	
	
	void sondansil() 
	{
		if(head==null)
			System.out.println("liste boş silinecek bir şey yok");
		else if(head.next==null) 
		{
			head=null;
			tail=null;
			System.out.println("tek eleman silindi liste boş ");
		}
		else 
		{
			Node tmp=head;
			Node tmp2 = head;
			
			while(tmp.next!=null) {
				
				tmp2=tmp;
				tmp=tmp.next;
			}
			
			tmp2.next=null;
			tail=tmp2;
			System.out.println("son eleman silindi ");
		}
	}

	void aradansil(int indis) 
	{
		if(head==null)
			System.out.println("liste boş silinecek bir şey yok");
		else if(head.next==null && indis ==0) 
		{
			head=null;
			tail=null;
			System.out.println("tek eleman silindi");
		}
		else if(head.next!=null && indis ==0) 
		{
			head=head.next;
			System.out.println("ilk eleman silindi");
		}
		else 
		{
			Node tmp=head;
			Node tmp2 =head;
			int i=0;
			
			while(tmp!=null) 
			{
				i++;
				tmp2=tmp;
				tmp=tmp.next;
			}
			
			if(i==indis) 
			{
				tmp2.next=null;
				tail=tmp2;
			}
			
			else 
			{
				tmp=head;
				tmp2=head;
				int j=0;
				while(j!=indis) 
				{
					tmp2=tmp;
					tmp=tmp.next;
					j++;
				}
				tmp2.next=tmp.next;
				System.out.println(indis+ "indisinci eleman aradan silindi ");
			}
		}
	}
	
	void yazdır() 
	{
		if(head == null) 
		{
			System.out.println("liste boş yazdırılacak bir şey yok");
		}
		else 
		{
			Node tmp= head;
			System.out.print("baş");
			while(tmp!=null) 
			{
				System.out.print(" -> " + tmp.data);
				tmp=tmp.next;
			}
			System.out.print(" son");
			
		}
	}
}
