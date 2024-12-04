
public class Ana {
	public static void main(String[] args) {
		
		int s1 ,s2,s3;
		s1=10;
		s2=18;
		s3=9;
		
		A a = new A(s1);
		B b = new B(s1,s2);
		C c = new C(s1,s2,s3);
		
		
		System.out.println("a nın bilgileri");
		System.out.println(a.a);
		System.out.println("b nın bilgileri");
		System.out.println(b.b);
		System.out.println("c nın bilgileri");
		System.out.println(c.c);
	}

}
