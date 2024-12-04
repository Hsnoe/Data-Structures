package quequeYapisi;

public class quequeYapisi {
	int [] dizi;
	int size;
	int front;         // dizinin baştaki elemanı
	int rear;          // dizinin son elemanını tutar
	
	public quequeYapisi(int size) {
		this.size=size;
		dizi = new int[size];   //kuyruk yapımız
		front=0;
		rear=-1;
	}
	
	
	void enQueue(int data) 
	{
		if(isFull()) 
		{
			System.out.println("kuyruk dolu ekleme yapamazsınız");
		}
		else 
		{
			rear++;
			dizi[rear]=data;
			System.out.println(dizi[rear]+"kuyruğa eklendi");
		}
	}
	
	void deQueue()
	{
		if(isEmpty())
			System.out.println("kuyruk boş silinme işlemi yapılamaz");
		else 
		{
			int sayi= dizi[front];
			for(int i=1; i<=rear; i++) 
			{
				dizi[i-1]=dizi[i];
			}
			rear--;
			System.out.println(sayi+"kuyruktan çıkarıldı");
		}
	}
	
	public boolean isFull() 
	{
		return rear==size-1;
	}
	
	public boolean isEmpty() 
	{
		return rear == -1;
	}
	
	void elemanSayisi() 
	{
		System.out.println("eleman sayisi ; "+(rear+1));
	}
	
	void yazdır() 
	{
		int i=rear;
		System.out.print("son ->");
		while(i>=0) 
		{
			System.out.print(dizi[i]+ " ->");
			i--;
		}
	}

}
