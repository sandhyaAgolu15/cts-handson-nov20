package collections;

import java.util.ArrayList;
import java.util.List;

public class Ulist {

	public static void main(String[] args) {
		
		List<Listuser> list=new ArrayList<>();
		list.add(new Listuser(123,"Sandhya","Sandy123"));
		list.add(new Listuser(234,"charan","charan123"));
		list.add(new Listuser(345,"abhishek","abhi123"));
		list.add(new Listuser(456,"Vyshnavi","vyshu123"));
		list.add(new Listuser(567,"Vamsi","vamsi123"));
		System.out.println("Length of username greater than 5: ");
		for(Listuser a:list)
		{
			if(a.getName().length()>5)
			{
				System.out.println(a);;
			}
		}
		
		
		
	}

}