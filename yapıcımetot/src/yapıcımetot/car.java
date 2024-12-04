package yapıcımetot;

public class car {
	
	String model;
	String type;
	String color;
	int speed;
	int hızlimiti=180;
	
	
	car(String model,String color,String type){
		System.out.println("özellikler atandı");
		this.model=model;
		this.color=color;
		this.type=type;
		this.speed=10;
		
	}
	car(){
		System.out.println("boş");
	}
	
	
	
	void hızarttır(int fast) 
	{
		if((speed+fast)<hızlimiti)
			speed+=fast;
	}
	
	void yavaşalat(int slow) 
	{
		if((speed-slow)>0)
			speed-=slow;
	}
	
	void print() 
	{
		System.out.println(model +" arabasının hızı :" + speed);
	}
	
	
	void printinfo() {
		model="tofaş";
		System.out.println("arabanın modeli: " + this.model);
		System.out.println("arabanın tipi  :  " + type);
		System.out.println("arabanın rengi :  " + color);
		System.out.println("araanın hızı : "  + speed);
		System.out.println("------------------------");
		
	}
	
	
	

}
