package siralamaalgoritm;

public class bubbleshort {
	public static void bubleSort(int[] dizi) {
		int temp;
		for(int i=0; i<dizi.length;i++) {
			for(int j=0; j < dizi.length - i - 1; j++) {
				
				if(dizi[j] > dizi[j+1]) {
					temp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=temp;
				}
			}
		}
		for(int i=0; i<dizi.length;i++) {
			System.out.print(dizi[i] +" , ");
		}
		System.out.println("");
	}
	

}
