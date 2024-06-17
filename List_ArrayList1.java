package collectionExample.ListExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class List_ArrayList1 {

public static void main(String[] args) {
		int sum=0;
		List<Integer> l1= new  ArrayList<Integer>(30);
		/*l1.add(23);
		l1.add(34);
		l1.add(2);
		l1.add(45);
		l1.add(30);*/
		for(int i=1;i<=20;i++)
		{
			l1.add(i);
		}
		
		System.out.println(l1);
		Iterator it1=l1.iterator();
		while(it1.hasNext())
		{
			Integer rs= Integer.parseInt(it1.next().toString());
					if(rs%2==0)
					{
						sum=sum+rs;
					}
				}
		System.out.print(sum);

	}
}
