
public class Uygulama {

	public static void main(String[] args) {
		
		Tablo htablo = new Tablo(5);
		
		htablo.ekle(0,"ahmet");
		htablo.ekle(10,"memo");

		htablo.ekle(3,"fakih");
		htablo.ekle(4,"fatma");
		
		htablo.ekle(2,"ayse");
		htablo.ekle(22,"muzo");
		
		htablo.ekle(15,"sıla");
		htablo.ekle(9,"hasan");
		
		htablo.sil(22);
		System.out.println();
		
		htablo.yazdir();
	}

}
