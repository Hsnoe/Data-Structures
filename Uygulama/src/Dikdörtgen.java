
public class Dikdörtgen extends sekil{
	
	public Dikdörtgen(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	double cevre() {
		return 2*(x+y);
	}
	
	@Override
	double alan() {
		
		return x*y;
	}

}
