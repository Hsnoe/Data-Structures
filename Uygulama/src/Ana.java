
public class Ana {
	public static void main(String[] args) {
		
		Kare k1 = new Kare(18);
		Dikdörtgen d1 = new Dikdörtgen(10, 6);
		Daire da1 = new Daire(4);
		
		System.out.println("alanı daşire"+ da1.alan());
		System.out.println("karein alanaı "+ k1.alan());
		System.out.println("daire cevre "+ d1.cevre());
		System.out.println("kare cevre "+k1.cevre());
		
		sekil ref;
		sekil ref1;
		ref=k1;
		ref1=d1;
		System.out.println("karenin alanı ref ile "+ ref.alan());
		System.out.println("daire cevre ref ile  "+ ref1 .cevre());
		
		
		
		sekil [] refDizi = new sekil[3];
		
		refDizi[0]= k1;
		refDizi[1]=d1;
		refDizi[2]=da1;
		
		
		for (sekil sekil : refDizi) {
			System.out.println(sekil.alan());
			System.out.println(sekil.cevre());
			
		}
		
		
	}

}
