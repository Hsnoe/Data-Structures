import java.util.Scanner;

public class uygulma2 {
	public static void main(String[] args) {
		int no,not;
		String ad;
		
		
		tree2 bt = new tree2();
		Scanner scanner= new Scanner(System.in);
		int secim=-1;
		
		while(secim!=0) 
		{
			System.out.println("1-ekle");
			System.out.println("2-sil");
			System.out.println("3-yazdır");
			System.out.println("0-çıkış yap.");
			System.out.println("seçim yapnız");
			secim=scanner.nextInt();
			
			if(secim==1) 
			{
				System.out.println("eklencek öğrenci bilgileeri giriniz :");
				System.out.println("nosu :"); no=scanner.nextInt();
				System.out.println("not :"); not=scanner.nextInt();
				System.out.println("ad :"); ad=scanner.nextLine();
				
				bt.root=bt.insert(bt.root, no, not, ad);
				System.out.println(no + "nolu kişi eklendi.");
				
				
			}
			
			else if(secim==2) 
			{
				System.out.println("silinecek öğrenci no sunu giriniz :");
				no=scanner.nextInt();
				bt.root=bt.delete(bt.root, no);
				System.out.println(no+ "lu kişi silindi.");
			}
			
			else if(secim==3) 
			{
				System.out.println("sıralama");
				bt.inOrder(bt.root);
				
			}
			
			else if(secim==0) 
			{
				System.out.println("ıkış yaptınız ");
			}
			else
				System.out.println("haatalı giriş yaptınız ");
			
			
			
			
		}
		secim=scanner.nextInt();
		
		
	}

}
