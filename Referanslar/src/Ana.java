
public class Ana {
	public static void main(String[] args) {
		
		Kişi referans;
		
		
		
		Kişi k1 = new Kişi("hayrye","fatma",28 );
		
		Yönetici y1 = new Yönetici("hasan","öge",18);
		
		İşci i1 = new İşci("sabiye","kartal",85);
		
		referans =k1;
		referans.yazdır();
		referans = y1;
		referans.yazdır();
		referans = i1;
		referans.yazdır();
		
		
		
	}

}
