
public class StackYapisi {
	int size ;   // stack kapasitesini kullanıcıdan ladık size diye
	int cnt;  //bir sayıcı
	Node top;      //en üst değeri tutan head gibi
	
	public StackYapisi(int size) {
		this.size = size;
		cnt=0;
		top=null;
	}
	
	
	void push(int data) 
	{
		Node eleman = new Node(data);      //stacke eklenecek eleman oluşturuld
		if(isFull())           
		{
			System.out.println("stack dolu");
		}
		else 
		{
			if(isEmpty()) 
			{
				top=eleman;                     
				System.out.println(top.data+"stacke ilk eleman eklendi.. ");
			}
			else 
			{
				eleman.next=top;          //eleman ekleme
				top=eleman;
				System.out.println(top.data+" stacke eklendi..");
			}
			cnt++;
		}
	}
	
	void pop() 
	{
		if(isEmpty()) 
		{
			System.out.println("boşş silinecek bir şey yok.");
		}
		else 
		{
			System.out.println(top.data + "çıkartıldı");
			top=top.next;
			cnt--;
		}
		
	}
	
	void print() 
	{
		if(isEmpty()) 
		{
			System.out.println("yazdıracak bir şey yok.");
		}
		else 
		{
			Node tmp=top;
			System.out.println("\n stack verileri");
			while(tmp!=null) 
			{
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
			
		}
	}
	
	void topG()
	{
		if(isEmpty())
			System.out.println("stack boşş");
		else 
		{
			System.out.println("en üstteki değer "+ top.data);
		}
	}
	
	
	
	boolean isFull() 
	{
		return cnt==size;
	}
	
	boolean isEmpty() 
	{
		return cnt==0;
	}
	

}
