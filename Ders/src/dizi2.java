
public class dizi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubçok boyutlu dizi
		
		int [] dizi1 = {3,8,9,7};
		System.out.println(dizi1[0]);
		
		int [][] dizi2 = new int[2][3];
		dizi2[0][0] = 10;
		dizi2[0][1] = 20;
		dizi2[0][2] = 30;
		dizi2[1][0] = 40;
		dizi2[1][1] = 50;
		dizi2[1][2] = 60;
		
		int [][] dizi = {{1,3,5},{2,4,6}};
		
		
		for (int i = 0 ; i<2 ; i++) {
			for (int j = 0 ; j<3 ; j++){
				System.out.print(dizi2[i][j]+"  ");
			}System.out.println();
		}
		
		
		
		for (int i = 0 ; i<2 ; i++) {
			for (int j = 0 ; j<3 ; j++){
				System.out.print(dizi[i][j]+"  ");
			}System.out.println();
		}

		
		String [][] soy = {{"semra","ayşe"},{"fatma","zehra"}};
		
		for (int i = 0 ; i<2;i++) {
			for (int j = 0 ; j<2 ; j++) {
				System.out.print(soy[i][j]+"  ");
			}System.out.println();
		}

	}

}
