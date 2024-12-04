package statickullanım;

public class Ana {
	public static void main(String[] args) {
		
		System.out.println(topla(10,20));
		
		Ana nesne = new Ana();
		System.out.println(nesne.topla(30, 70));
		
		System.out.println(nesne.topla2(80, 100));
		
		System.out.println(b.carp(180, 8));
		//System.out.println(b.carpstatik);   static değil
		
		b nesne1 = new b();
		System.out.println(nesne1.carpstatik(98, 108));
		
		
	}
	
	
	public static int topla(int a , int b) {
		return a+b ;
		
	}
	
	public int topla2 (int a,int b) {
		return a+b;
	}

}
