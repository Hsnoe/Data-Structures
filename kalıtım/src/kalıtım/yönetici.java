package kalıtım;

public class yönetici extends Kişi {
	
	String rol;
	
	public void yazdır() {
		
		super.yazdır();
		System.out.println("yöneticinin rolü  ; "+ rol);
	}

}
