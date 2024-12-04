
public class Daire extends sekil{
	
	public Daire(int r) {
		this.r=r;
		
		
	}
	
	@Override
	double alan() {
		
		return 3*r*r;
	}
	
	@Override
	double cevre() {
		return 2*3*r;
	}

}
