package yapıcımetot;

public class main {

	public static void main(String[] args) {
		car audi = new car("audi a3","black","sedan");
		System.out.println(audi.model);
		audi.printinfo();
		
		car bmw = new car("bmw c180","grey","sports");
		bmw.hızarttır(50);
		bmw.hızarttır(30);
		bmw.hızarttır(70);
		bmw.printinfo();

	}

}
