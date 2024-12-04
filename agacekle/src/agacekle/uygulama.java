package agacekle;

public class uygulama {
	public static void main(String[] args) {
		
		btree bst = new btree();
		
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 5);
		bst.root=bst.insert(bst.root, 12);
		bst.root=bst.insert(bst.root, 20);

		
		
		System.out.println("kök  : " + bst.root.data);
		System.out.println("kökün solu : " + bst.root.left.data );
		System.out.println("kökün sağı : " + bst.root.right.data );
		
		
		System.out.print("preorder dizilim :");
		bst.preOrder(bst.root);
		
		System.out.println();
		
		System.out.print("inorder dizilim :");
		bst.inOrder(bst.root);
		
		System.out.println();
		
		System.out.print("postorder dizilim :");
		bst.postOrder(bst.root);
		
		
		System.out.println("\nağacın yüksekliği :"+ bst.yükseklik(bst.root));
		System.out.println("ağactaki eleman sayısı : "+ bst.size(bst.root));
	}

}
