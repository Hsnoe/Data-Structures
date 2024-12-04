package quequePideci;

import java.util.Scanner;

public class queuepideYapisi {
	Scanner scanner = new Scanner(System.in);
	
	 Node front;  //head
	 Node rear;   // tail
	 int size;
	 int cnt;
	public queuepideYapisi(int size) {
		this.size = size;
		front=null;
		rear=null;
		
	}
	
	String isim;
	int adet;
	int toplamGelir;
	
	void enQueue() 
	{
		if(isFull()) 
		{
			System.out.println("kuyruk sırası dolu");
		}
		else 
		{
			System.out.println("müşteri ismmi "); isim =scanner.nextLine();
			
			System.out.println("pide sayısı:"); adet = scanner.nextInt();
			scanner.nextLine();
			Node eleman = new Node(adet, isim);
			
			if(isEmpty()) 
			{
				front=eleman;
				rear=eleman;
				System.out.println("kuruk yapısı oluşturuldu ilk müşteri sıraya girdi.");
			}
			else 
			{
				rear.next=eleman;
				rear=eleman;
				System.out.println(rear.isim+" sıraya girdi");
			}
			cnt++;
		}
	}
	
	void deQueue() 
	{
		if(isEmpty())
			System.out.println("pide sırasıdna kimse yok..");
		else 
		{
			toplamGelir += front.ucret;
			System.out.println(front.isim+" " +front.adet +" adet pidesini aldı, toplam borcu "+ front.ucret+ "tl");
			front =front.next;
			cnt--;
		}
	}
	
	void print() 
	{
		if(isEmpty())
			System.out.println("beleyen müşteri yok");
		else 
		{
			Node tmp=front;
			System.out.print("bas  <-");
			while(tmp != null)
			{
				System.out.print(tmp.isim + " <-");
				tmp=tmp.next;
				
			}
			System.out.println(" son");
		}
		
			
	}
	 
	 
	boolean isEmpty() 
	{
		return cnt==0;
	}
	 
	boolean isFull() 
	{
		return cnt==size;
	}

}
