
public class araba { // sınıf oluşturduk 
	String plaka;
	int modelyili;
	String renk;
	String model;
	
	
	public void hareketet() {
		System.out.println("arac hareket ediyor..");
		
	}
	
	
	public void dur() {
		System.out.println("araç durduruldu..");
	}
	
	
	public void yazdır() {
		System.out.println("Araç bilgileri: ");
		System.out.println("Araccın modeli   :" + model);
		System.out.println("Araın model yılı :" + modelyili );
		System.out.println("Araccın plakası  :" + plaka);
		System.out.println("Araccın rengi    :" + renk);
		
	}
	
	public String markagoster() {
		return model;
	}
}

