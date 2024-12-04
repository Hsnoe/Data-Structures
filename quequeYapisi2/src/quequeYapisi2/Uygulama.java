package quequeYapisi2;

public class Uygulama {

	public static void main(String[] args) {
		
		quequeYapisi kuyruk = new quequeYapisi(5);
		
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		kuyruk.enQueue(50);
		kuyruk.enQueue(60);
		
		
		kuyruk.deeQueue();
		
		System.out.println("kuyruktaki eleman sayısı ; "+ kuyruk.cnt );
		System.out.println("kuyurk başındaki eleman ; "+ kuyruk.front.data);
		kuyruk.print();
		
		
		

	}

}
