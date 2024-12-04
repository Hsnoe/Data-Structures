package siralamaalgoritm;

import java.util.Scanner;

public class uygulama {
	 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kaç elemanlı bir dizi olsun :");
		int n= scanner.nextInt();
		int dizi[]= new int[n];
		
		for(int i=0;i<n;i++) 
		{
			int sayi= scanner.nextInt();
			dizi[i]=sayi;
		}
		
		bublesort33(dizi, n);
		
		
		
		/*System.out.println("bubblesoth33 sıralama");
		bublesort33(dizi);
		System.out.println();
		
		System.out.println("selectionsort33 sıralama");
		selectionsort33(dizi);
		
		System.out.println();
		System.out.println("insertionsorth33 sıralama");
		insertionsorth33(dizi);*/
	}


	
	
	public static void bublesort33(int [] dizi,int n) 
	{
		for(int i=0;i<dizi.length;i++) 
		{
			for(int j=0; j<dizi.length-i-1;j++) 
			{
				if(dizi[j]>dizi[j+1]) 
				{
					int tmp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=tmp;
				}
			}
		}
		
		for(int i=0;i<dizi.length;i++) 
		{
			System.out.print(dizi[i]+" ,");
		}
		
	}
	
	public static void selectionsort33(int [] dizi) 
	{
		for(int i=0;i<dizi.length;i++) 
		{
			int minimum=i;
			for(int j=i+1;j<dizi.length;j++) 
			{
				if(dizi[minimum]>dizi[j])
					minimum=j;
				
			}
			int tmp=dizi[minimum];
			dizi[minimum]=dizi[i];
			dizi[i]=tmp;
		}
		for(int i=0;i<dizi.length;i++) 
		{
			System.out.print(dizi[i]+",");
		}
		
		
	}
	
	
	public static void insertionsorth33(int [] dizi) 
	{
		for(int i=1;i<dizi.length;i++) 
		{
			for(int k=i;k>0;k--) 
			{
				if(dizi[k]>dizi[k-1]) 
				{
					int tmp=dizi[k-1];
					dizi[k-1]=dizi[k];
					dizi[k]=tmp;
				}
			}
		}
		for(int i=0;i<dizi.length;i++) 
		{
			System.out.print(dizi[i]+",");
		}
		
		
	}

}
