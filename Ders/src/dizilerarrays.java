
public class dizilerarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub diziler
		
		int [] sayilar = new int [5]; //tanmlama yaptım
		sayilar[0]=10;
		sayilar[2]=5;
		sayilar[1]=4;
		sayilar[3]=9;
		sayilar[4]=10;
		
		int sayilar2[]= {5,78,8,1,22,5,5}; //hem tanımla yaptım hem değer atadım;
		
		
		for (int i=0;i<5;i++) {
			System.out.println(sayilar[i]);
		}
		System.out.println("-**************-");
		
		for (int i=0;i<sayilar2.length;i++) {
			System.out.println(sayilar2[i]);
		}
		
		
		String [] isimler = new String[3];
		isimler[0] = "hasan";
		isimler[1] = "kate";
		isimler[2] = "jacke";
		
		String [] isimler2 = {"semra","eslem","defne","sıla","azra","fatma","zeynep" };
		isimler2[3] = "kate";
		
		
		for (int i =0 ; i<isimler.length ; i++) {
			System.out.println(isimler[i]);
		}
		System.out.println("----------------------------");
		
		for (int i =0 ; i<isimler2.length ; i++) {
			System.out.println(isimler2[i]);
		}
		
		
		

	}

}
