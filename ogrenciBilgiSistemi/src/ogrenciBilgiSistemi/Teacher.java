package ogrenciBilgiSistemi;

public class Teacher {
	
	String name;
	String mpno;
	String branch;
	
	Teacher(String name,String mpno,String branch){
		this.name=name;
		this.mpno=mpno;
		this.branch=branch;
		
	}
	
	
	void print() {
		System.out.println("hocanın ismi: "+ this.name);
		System.out.println("telefon numarası: "+ this.mpno);
		System.out.println("hocanın branşı: "+ this.branch);
	}

}
