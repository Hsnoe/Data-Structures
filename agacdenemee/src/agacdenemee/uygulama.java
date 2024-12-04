package agacdenemee;

public class uygulama {
	public static void main(String[] args) {
		
		btree bt = new btree();
		
		bt.root=bt.insert(bt.root, 10, 42, "hasan");
		bt.root=bt.insert(bt.root, 3, 4, "hn");
		bt.root=bt.insert(bt.root, 0, 2, "hasn");
		bt.root=bt.insert(bt.root, 1, 42, "han");
		
		bt.inOrder(bt.root);
		System.out.println("-------------");
		bt.preOrder(bt.root);
		
	}

}
