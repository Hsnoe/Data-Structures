
public class Ana {
	public static void main(String[] args) {
		
		araba nesne = new araba(); // nesne oluşturdum
		
		nesne.model = "Toyota";  //nesne değerleri girdik
		nesne.modelyili = 2020;
		nesne.plaka = "34PLT34";
		nesne.renk = "siyah";
		
		araba nesne2 = new araba();
		
		nesne2.model = "audi";  //ikinci nesnem
		nesne2.modelyili = 2022;
		nesne2.plaka = "44aes891";
		nesne2.renk = "beyaz";
		
		
		nesne.yazdır();
		System.out.println("-----------");
		nesne2.yazdır();
		
		System.out.println();
		
		nesne.hareketet();
		nesne.dur();
		
		System.out.println();
		
		nesne2.hareketet();
		nesne2.dur();
		
		System.out.println(nesne2.dur());
		
		System.out.println("birinci aracın markası : "+nesne.markagoster());
		
		System.out.println("ikinci aracın markası : "+nesne2.markagoster());
		
		
	}
	
	

}
