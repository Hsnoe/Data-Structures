
public class Tablo {
	
	Node dizi[];
	int size;
	
	public Tablo(int size) {
		this.size=size;
		dizi= new Node[size];
		
		for(int i=0 ; i<size ; i++) 
		{
			dizi[i] = new Node();         //dizimizi oluşturduk içine varsayılan node ları ekledik boş bir şekilde
		}
		
		
	}
	
	int indexUret(int key)          //bu fonksiyonda modunu alıp dizimde hangi indexe yerleştireceğimi buldum
	{
		return key % size;
		
	}
	
	void ekle(int key,String ad) 
	{
		int index= indexUret(key);    //bulduğum değeri indexe attım
		
		Node eleman = new Node(key,ad);
		
		Node tmp = dizi[index];    // dizimi indexten başlattım
		
		while(tmp.next!=null)     // null olana kadar ilerle
			tmp=tmp.next;    
		
		tmp.next=eleman;     // sona atadım
		
		System.out.println(eleman.ad+"eklenddi");
	}
	
	void sil(int key) 
	{
		
		boolean sonuc=false;
		int indis = indexUret(key); // sileceğim elemanı buldum
		Node tmp= dizi[indis];
		Node tmp2=dizi[indis];
		
		if(tmp.next ==null) 
		{
			System.out.println( key +" numaralı kayıt yok");
			sonuc=true;
		}
		else if(tmp.next.next== null && tmp.next.key==key)  // bir üğüm vardır ve silmek istediğimiz düğüm bu düğümdür
		{
			sonuc=true;
			System.out.println("bu kısımdaki son kişi olan"+tmp.next.ad+" silindi");
			tmp.next=null;
			
		}
		else 
		{
			
			while(tmp.next!=null) {
				
				tmp2=tmp;
				tmp=tmp.next;
				if(tmp.key==key) 
				{
					sonuc =true;
					System.out.println(tmp.ad + " silindi");
					tmp2.next=tmp.next;
					
				}
					
					
				
			}
		}
		if(sonuc ==false) {
			System.out.println(key+ " numarli kayıt yok");
		}
		
	}
	
	void yazdir() 
	{
		for(int i=0 ; i <size ; i++) 
		{
			
			Node tmp=dizi[i];
			System.out.print("dizi["+i+"] -> ");
			if(tmp.next!=null)
				while(tmp.next!=null) 
				{
					System.out.print(tmp.next.key+" - "+ tmp.next.ad+ "->");
					tmp=tmp.next;
				}
			System.out.println();
				
		}
		
	}
	
	
	

}
