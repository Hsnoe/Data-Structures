package agacdenemee;

public class btree {
	node root;

	public btree() {
		root=null;
	}
	
	
	node newnode(int no,int not,String ad)  //roota değerleri girim düğüm oluşturdum
	{
		root= new node(no,not,ad);
		return root;
	}
	
	
	node insert(node root,int no,int not,String ad) 
	{
		if(root!=null) 
		{
			if(root.no>no)
				root.left=insert(root.left,no,not,ad);
			else
				root.right=insert(root.right,no,not,ad);
		}
		else
			root=newnode(no,not,ad);
		return root;
		
	}
	
	
	void inOrder(node root) 
	{
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.no+"\t"+root.ad+"\t"+root.not);
			inOrder(root.right);
		}
		
	}
	
	
	void preOrder(node root) 
	{
		if(root!=null) {
			System.out.println(root.no+"\t"+root.ad+"\t"+root.not);
			preOrder(root.left);
			preOrder(root.right);
		}
		
	}
	
	
	node delete(node root,int x) 
	{
		node t1,t2;
		if(root==null)  // root yoksa silme yok null gönder
			return null;
		if(root.no==x)   // silleceğim düğümü buldumm altında bir şey  varmı onu kontrol edicm
		{
			if(root.left==root.right)   // siile ceğim düğümün altında düğüm yok
			{
				root=null;
				return root;
			}
			else if(root.left==null) //sileceğim düğümün sağında düğüm var o düğümü getiricem
			{
				t1=root.right;
				return t1;
				
			}
			else if(root.right==null)  //sileceğim düğğümün solunda var onu getir 
			{
				t1=root.left;
				return t1;
			}
			else 
			{
				t1=t2=root.right;
				while(t1.left!=null) 
				{
					t1=t1.left;
				}
				t1.left=root.left;
				return t2;
				
			}
		}
		else 
		
		{
			if(root.no>x)
				root.left=delete(root.left,x);
			else
				root.right=delete(root.right,x);
		}
			
		return root;
	}
	
	

	int yükseklik(node root) 
	{
		if(root==null)
			return -1;
		else 
		{
			int sag=0, sol=0;
			sag=yükseklik(root.right);
			sol=yükseklik(root.left);
			
			if(sag>sol)
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
