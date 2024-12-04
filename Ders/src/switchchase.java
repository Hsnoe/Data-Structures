import java.util.Scanner;

public class switchchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int haftaningünü;
		System.out.println("bir gün giriniz");
		haftaningünü = input.nextInt();
		
		switch(haftaningünü) {
		case 1:System.out.println("pazartesi");break;
		case 2:System.out.println("salı");break;
		case 3:System.out.println("çarşamba");break;
		case 4:System.out.println("perşembe");break;
		case 5:System.out.println("cuma");break;
		case 6:System.out.println("cumartesi");break;
		case 7:System.out.println("pazar");break;
		default:System.out.println("yanlış gün girdiniz");
		
		}

	}

}
