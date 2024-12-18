
public class Uygulama {

	public static void main(String[] args) {
		Tree bst = new Tree();
		
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 5);
		bst.root=bst.insert(bst.root, 12);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 9);
		bst.root=bst.insert(bst.root, 25);
		System.out.println("köök;"+bst.root.data);
		System.out.println("köökün solu ;"+bst.root.left.data);
		System.out.println("kökon sağı"+ bst.root.right.data);
		
		System.out.println("preorder prensibine göre dolaş:");
		bst.preOrder(bst.root);
		System.out.println();
		System.out.println("ineorder prensibine göre dolaş:");
		bst.inOrder(bst.root);
		
		System.out.println();
		System.out.println("posteorder prensibine göre dolaş:");
		bst.postOrder(bst.root);
		
		System.out.println("\n\nagacın yüksekliğği : "+ bst.height(bst.root));
		System.out.println("\n agac üzerindeki eleman sayısı"+bst.size(bst.root));
	}

}
