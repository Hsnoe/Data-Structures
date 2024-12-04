package ilkders;
import java.util.Scanner;
public class notortalmasibulanprogram {
	public static void main(String[] args) {
		int vize,fınal;
		double ort;
		Scanner input = new Scanner(System.in);
		System.out.println("vize notunuzu giriniz:");
		vize=input.nextInt();
		System.out.println("final  notunuzu giriniz:");
		fınal = input.nextInt();
		ort = (vize*0.4)+(fınal*0.6);
		System.out.println("ortalamanız:"+ort);
		
		String sonuc = (ort>50) ? "geçtiniz" : "kaldınız";
		System.out.println(sonuc);
		
		
		
		
		
		
	}
}
