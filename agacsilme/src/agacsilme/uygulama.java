package agacsilme;

public class uygulama {

	public static void main(String[] args) {
		btree bt = new btree();
		
		bt.root=bt.insert(bt.root, 10, "hasan", 70);
		bt.root=bt.insert(bt.root, 20, "selma", 20);
		
		bt.inOrder(bt.root);
		
		bt.delete(bt.root, 20);
		
		System.out.println("ilindikten sonnra --- ");
		bt.inOrder(bt.root);

	}

}
