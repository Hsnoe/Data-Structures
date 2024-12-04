import java.util.Scanner;

public class dizidearamaserach {

	public static void main(String[] args) {
		// search işlemi
		 int [] list ={3,8,9,3,15,5,0,9 };
		Scanner imp = new Scanner(System.in);
		System.out.println("listemin elemanları =");
		for (int i = 0 ; i<list.length ;i++)
			System.out.print(list[i]+" ");
		
		System.out.println();
		System.out.println("hangi eleman olsun");
		
		
		int sec,indis=-1;
		sec = imp.nextInt();
		boolean sonuc = false;
		
		for(int i=0 ;i<list.length;i++) {
			if(sec == list[i]) {
				indis =i;
				sonuc =true;
				break;
						
				
			}
		}
		if(sonuc)
			System.out.println("seçtiğim sayı"+sec+" "+(++indis)+" in içinde");
		else
			System.out.println("seçtiğim sayı"+sec+" listede yok");
		
		
		
		

	}

}
