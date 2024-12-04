
public class deneme {
	Node root;
	public deneme() 
	{
		root=null;
	}
	
	
	Node newNode(int data){
		root=newNode(data);    //kök oluşturma
		return root;
		
	}
	
	Node insert(Node root,int data) 
	{
		if(root!=null) 
		{
			if(data<root.data) {
				root.left=insert(root.left,data);
			}
			else
				root.right=insert(root.right,data);
			
		}
		else
			root=newNode(data);
		return root;
		
		
	}
	
	void preOrder(Node root) 
	{
		if(root!=null ) {
			
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void inOrder(Node root) 
	{
		
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
	void postOrder(Node root) 
	{
		
		preOrder(root.left);
		
		inOrder(root.right);
		
		System.out.println(root.data);
	}
	
	
	
	
	

}
