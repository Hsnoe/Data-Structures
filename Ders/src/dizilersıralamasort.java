
public class dizilersıralamasort {

	public static void main(String[] args) {
		// sıralama,
		
		int [] dizi = {18,2,8,4,6,4,13,9,0};
		System.out.println("dizi  =");
		
		for (int i=0 ; i<dizi.length ; i++)
			System.out.print(dizi[i]+" ");
		
		
		int gecici;
		
		for ( int i =0 ; i<dizi.length ;i++) {
			for (int j = 0 ; j<dizi.length-1 ; j++) {
				if (dizi[j]>dizi[j+1]) {
					gecici = dizi[j];
					dizi[j] =dizi[j+1];
					dizi[j+1] = gecici;
				}
				
			}
		}
		System.out.println();
		System.out.println("dizi sıralanmış hali  =");
		
		for (int i=0 ; i<dizi.length ; i++)
			System.out.print(dizi[i]+" ");

	}

}
