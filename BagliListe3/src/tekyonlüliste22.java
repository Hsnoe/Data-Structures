
public class tekyonlüliste22 {
	Node head=null;
	Node tail=null;
	
	
	void basaekle(int x) 
	{
		Node eleman = new Node();
		eleman.data=x;
		
		if(head==null) 
		{
			head=eleman;
			tail=eleman;
		}
		else 
		{
			eleman.next=head;
			head=eleman;
		}
	}

}
