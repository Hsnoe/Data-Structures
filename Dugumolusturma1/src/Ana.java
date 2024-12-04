
public class Ana {
	public static void main(String[] args) {
		
		
		Sinif A = new Sinif();    // bellekte düğüm oluşturdum.
		Sinif B = new Sinif();
		Sinif C = new Sinif();
		
		
		A.sayi= 60;   // düğümlere değerlerini atıyoruz.
		B.sayi= 70;
		C.sayi= 80;
		
		
		/*System.out.println(A.sayi);
		System.out.println(B.sayi);  // düğüm değerlerini ekrana yazdırdım.
		System.out.println(C.sayi);*/
		
		A.next = B;
		B.next = C;             // düğümleri birbirine bağladım.
		C.next = null;
		
		Sinif tmp= A;
		
		while ( tmp!= null) {        //düğümler üzerinde dolaştm.
			
			System.out.println(tmp.sayi);
			tmp = tmp.next;
			
		}
		
		
	}

}
