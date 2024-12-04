
public class tree2 {
	
	node2 root;

	public tree2() {
		root=null;
	}
	
	node2 newnode(int no,int not,String ad)  // düğümü oluşturup değerlerini ekledim roota gönderdim
	{
		root= new node2(no,not,ad);
		return root;
	}
	
	node2 insert(node2 root,int no,int not,String ad) 
	{
		if(root!=null)  // root boş değilse içeri gir sağa sola ekleme yap ifle kontrol ederrek 
		{
			if(no <root.no)
				root.left=insert(root.left,no,not,ad);
			else
				root.right=insert(root.right,no,not,ad);
			
		}
		else
			root= newnode(no,not,ad);  // root boşsa bu fonksiyonu çağır roota düğüm ata
			
		return root;
	}
	
	void inOrder(node2 root) 
	{
		if(root!=null) 
		{
			inOrder(root.left);
			System.out.println(root.ad+ "\t" +root.no+ "\t" +root.not);
			inOrder(root.right);
		}
	}
	
	
	node2 delete(node2 root,int x) 
	{
		node2 t1,t2;
		
		if(root==null)   // root boş boş değer dönderdim 
			return null;
		if(root.no ==x)       //sileceğim düğümü buldum altında bir şey vamı onu kontrol edicem
		{
			if(root.left==root.right)    // sağ sol eşitse altında bir şey yok demektir o yüzden root direk bnull olurr
			{
				root=null;
				return root;
			}
			else if(root.left==null)  //sol boş sağ doluysa sağı gri dönder
			{
				t1=root.right;
				return t1;
			}
			else if(root.right==null) // sağ boş sol doluysa soluı geri dönder
			{
				t1=root.left;
				return t1;
			}
			else    // 2 taraf da dolu demek o zaman silincek düğüm yerine sağ daki düğüm gelsin
			{
				
				t1 = t2 = root.right;
				
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
			if(x<root.no)
				root.left=delete(root.left,x);
			else
				root.right=delete(root.right,x);
	
		}
		return root;
			
				
		
	}
	
	

}
