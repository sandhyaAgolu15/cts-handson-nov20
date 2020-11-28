package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<Setuser> set=new HashSet<Setuser>();
		set.add(new Setuser(100,"Sandhya","sandy111"));
		set.add(new Setuser(100,"Sree","sandy111"));
		set.add(new Setuser(100,"Agolu","sandy111"));
		set.add(new Setuser(100,"ganesh","sandy111"));
		set.add(new Setuser(100,"jai","sandy111"));

		System.out.println("size of set is "+set.size());
	}

}
