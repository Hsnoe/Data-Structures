package qkuyrukpideciuygulaması;

import java.util.Scanner;

public class pidekuyruk {
	
	pidenode front;  //head
	pidenode rear;   // tail
	
	int kapasite;
	int cnt;
	
	public pidekuyruk(int kapasite) {
		this.kapasite=kapasite;
		cnt=0;
		front=null;
		rear=null;
	}
	
	String ad;
	int adet;

	
	Scanner scanner = new Scanner(System.in);
	
	
	void enQueue() 
	{
		System.out.println("kuyruğa girenin ismi : "); ad=scanner.nextLine();
		System.out.println();
		System.out.println("kaç adet aldı :"); adet=scanner.nextInt();
		pidenode müşteri = new pidenode(ad,adet);
		
		if(isFull())
			System.out.println("kuyruk sırası dolu müşteri alamayız .. ");
		else 
		{
			if(isEmpty()) 
			{
				front=müşteri;
				rear=müşteri;
				System.out.println("ilk müşteri sıraya girdi...");
			}
			else 
			{
				rear.ileri=müşteri;
				rear=müşteri;
				System.out.println(rear.ad+ " sıraya girdi..");
			}
			cnt++;
		}
		
		
	}
	
	
	void deQueue() 
	{
		if(isEmpty())
			System.out.println("müşteri yok kuyrukta ");
		else 
		{
			System.out.println(front.ad+ " müşterisi  "+ front.ad + " pide alıp  "+ front.ucret  + " tl ödeyip gitti");
			front=front.ileri;
			cnt--;
		}
		
		
	}

	
	void print() 
	{
		pidenode tmp=front;
		
		while(tmp!=null) 
		{
			System.out.println("müşterinin adı :"+ tmp.ad+"\tmüşterinin aldığı ekmek sayısı :" +tmp.adet);
			tmp=tmp.ileri;
		}
		
	}
	
	boolean isEmpty() 
	{
		return cnt==0;
	}
	
	
	boolean isFull() 
	{
		return cnt==kapasite;
	}
	
	

}
