package kalıtım;

public class ana {
	public static void main(String[] args) {
		
		muhasebeci m1 = new muhasebeci();
		
		m1.ad ="hasan";
		m1.soyad ="öge";
		m1.yas= 22;
		m1.maas=3500;
		
		Kişi k1 = new Kişi();
		
		k1.ad = " selma ";
		k1.soyad = "kurt ";
		k1.yas = 22;
		
		
		yönetici y1 = new yönetici();
		
		y1.ad = " jacke";
		y1.soyad = " sheperd";
		y1.yas = 42;
		y1.rol = "üst yönetici";
		
		System.out.println("kişi sınıfının nesnesinin bilgileri ;");
		k1.yazdır();
		
		System.out.println("muhasebeci sınıfının nesnesinin ilgileri;");
		m1.yazdır();
		
		System.out.println("yönetici sınıfının nesnesinin bilgileri ;");
		y1.yazdır();
		
		
		
	}

}
