
public class Uygulama {

	public static void main(String[] args) {
		
		StackYigin stack = new StackYigin(5);
		
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
		System.out.println("çıkan " + stack.pop());
		System.out.println("çıkan " + stack.pop());
		System.out.println("çıkan " + stack.pop());

	}

}
