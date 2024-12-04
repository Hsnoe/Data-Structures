package metotaşiriyükleme;

public class hesaplama {
	
	public int topla(int a , int b) {
		System.out.println("tam sayı toplama metodu ; ");
		return a+b ;
		
	}
	
	public float topla(float a , float b) {
		System.out.println("float toplama metodu ; ");  // bir fonksiyonu birden fazla çeşit parametre verdiğimde şırı yükleme overloded oluyor
		
		return a+b ;
		
	}

	public float topla(int a , float b) {
		System.out.println("tam-float sayı toplama metodu ; ");
		return a+b ;
		
	}
}
