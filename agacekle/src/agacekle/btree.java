package agacekle;

public class btree {
	
	node root;

	public btree() {
		root=null;
	}
	
	
	node newnode(int data)       //ekleme işlemini burda yaptım
	{
		root= new node(data);
		System.out.println(data+" eklendi ");
		return root;
	}
	
	
	node insert(node root,int data) 
	{
		if(root!=null) 
		{
			if(data <root.data)
				root.left=insert(root.left,data);
			else
				root.right=insert(root.right,data);
		}
		else
			root= newnode(data);
		return root;
			
	}
	
	void preOrder(node root) 
	{
		if(root!=null) 
		{
			System.out.print(root.data+ " ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	
	void inOrder(node root) 
	{
		if(root!=null) 
		{
			
			inOrder(root.left);
			System.out.print(root.data+ " ");
			inOrder(root.right);
		}
		
	}
	
	void postOrder(node root) 
	{
		if(root!=null) 
		{
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+ " ");
		}
		
	}
	
	
	int yükseklik(node root) 
	{
		if(root==null)
			return 0;
		else 
		{
			int sag=0, sol=0;
			
			sol=yükseklik(root.left);
			sag=yükseklik(root.right);
			
			if(sag> sol)
				return sag+1;
			else
				return sol+1;
				
		}
	}
	
	int size(node root) 
	{
		if(root==null)
			return 0;
		else
			return size(root.left)+1+size(root.right);
		
	}
	

}
