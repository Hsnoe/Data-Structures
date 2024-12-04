
public class StackYigin {
	int dizi[];
	int size;
	int indis;
	
	public StackYigin(int size) {
		this.size=size;
		dizi = new int[size];
		indis= -1;
	}
	
	
	void push(int data)    //ekle işlemi
	
	{
		if(isFull()) 
		{
			System.out.println("stack doluu..");
		}
		else 
		{
			indis++;     //dizi deki indis
			dizi[indis] = data;    //datayı diziye ekliyoruz
			System.out.println("eklendi ;" +dizi[indis]); //dizi indis ekleneni göster
		}
	}
	
	int pop()         //çıkarma işlemi
	{
		if( !isEmpty())                   
		{
			indis--;
			return dizi[indis];
		}
		else 
		{
			System.out.println("dizi boş..");
			return -1;
		}
	}
	
	boolean isFull() 
	{
		return (indis == size);      //indis değerim dizinin boyutuna eşitse zaten dolu demek
	}
	
	boolean isEmpty() 
	{
		return (indis ==-1);            //indis değerim ilk indis değerime eşitse boş demek
	}

}
