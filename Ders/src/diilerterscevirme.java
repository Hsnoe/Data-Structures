
public class diilerterscevirme {

	public static void main(String[] args) {
		// ters çevirme işlemi
		
		int [] dizi = {1,2,8,4,6,4,13,9,0};
		System.out.println("dizi =");
		
		for (int i=0 ; i<dizi.length ; i++)
			System.out.print(dizi[i]+" ");
		
		
		
		for (int i = 0 ;i<dizi.length/2 ;i++ ) {
			int gecici;
			gecici = dizi[i];
			dizi[i] = dizi[dizi.length-i-1];
			dizi[dizi.length-i-1] = gecici;
			
		}System.out.println();
		System.out.println("tes çevrilmiş hali =");
		for (int i=0 ; i<dizi.length ; i++)
			System.out.print(dizi[i]+" ");
		

	}

}
