import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		//create
		HashSet<Integer> set=new HashSet<>();
		//insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4); 
		set.add(1);
		//search
		if(set.contains(1))
		{
			System.out.println("set contains 1 ");
			
		}
		if(!set.contains(6))
		{
			System.out.println("does not contain 6");
		}
		
		//delete
		System.out.println("total elements in hashset:"+set.size());
		set.remove(1);
		System.out.println("1 element is removed");
		System.out.println("total elements in hashset:"+set.size());
		System.out.println(set);
		Iterator it =set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		

	}

}
