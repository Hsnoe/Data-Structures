
public class Btree {
	
	Node root;  //head gibi elimizde tututcaz

	public Btree() {
		root=null;
	}
	
	
	Node newNode(int data)  //bir fonksiyon oluşturduk
	{
		
		root = new Node(data);   // rootu oluştursun datayı eklesin
		System.out.println(data+"ağac eklendi");
		return root;    // geri dönüş olarak rootu döndersin
	}
	
	Node insert (Node root, int data)     //ekleme işlemi yapacağız
	{
		if( root!=null) 
		{
			if(data<root.data) 
			{
				root.left = insert(root.left,data);
			}
			else
				root.right=insert(root.right,data);
			
		}
		else
			root=newNode(data);
		return root;
	}
	
	

}
