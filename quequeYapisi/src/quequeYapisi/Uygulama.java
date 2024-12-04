package quequeYapisi;

public class Uygulama {

	public static void main(String[] args) {
		quequeYapisi kuyruk = new quequeYapisi(5);
		kuyruk.enQueue(10);
		kuyruk.enQueue(20);
		kuyruk.enQueue(30);
		kuyruk.enQueue(40);
		
		kuyruk.deQueue();
		kuyruk.deQueue();
		
		kuyruk.yazdır();

	}

}
