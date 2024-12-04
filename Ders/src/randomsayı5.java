import java.util.Random;

public class randomsayı5 {
	public static void main(String[] args) {
		
		Random rasgele = new Random();
		int sayi = rasgele.nextInt(100); // random sayı 100 e kadar
		System.out.println(sayi);
		
		// int sayi = rasgele.nextInt(büyük -küçük+1)+küçük ;
		
		int sayii = rasgele.nextInt(11)+20;// 20 ile 30 arası sayı üret
		System.out.println(sayii);
		}
	

}
