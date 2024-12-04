package quequeYapisi2;

public class quequeYapisi {
	
	Node front; //head
	Node rear;  // tail
	int cnt;   // sayici
	int size;
	public quequeYapisi(int size) {
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
		
	}
	
	
	void enQueue(int data) 
	{
		if(isFull())
			System.out.println("kuyruk dolu sizi alamicaz");
		else 
		{
			Node eleman = new Node(data);
			if(isEmpty()) 
			{
				front=eleman;
				rear=eleman;
				System.out.println(data+ " kuruğa ilk eklendi");
			}
			else 
			{
				rear.next=eleman;
				rear=rear.next;
				System.out.println(data+ " kuyruğa eklendi");
				
				
			}
			cnt++;
		}
		
		
	}
	
	
	void deeQueue() 
	{
		if(isEmpty()) 
		{
			System.out.println("slinecekk bir şey yok");
		}
		else 
		{
			
			System.out.println(front.data+ "silindi ");
			front=front.next;
			cnt--;
		}
	}
	
	public boolean isFull() 
	{
		return cnt==size;
	}
	
	public boolean isEmpty() 
	{
		return cnt==0;
	}
	
	
	void print() 
	{
		if (isEmpty())
			System.out.println("kuyruk boş yazdırılacak bir şey yok");
		else 
		{
			Node tmp = front;
			System.out.print("baş  <-");
			while(tmp!=null) 
			{
				
				System.out.print(tmp.data+ " <-");
				tmp=tmp.next;
			}
			System.out.println(" son");
		}
	}
	
	
	
	

}
