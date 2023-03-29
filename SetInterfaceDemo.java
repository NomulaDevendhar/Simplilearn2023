package mypackage;
import java.util.*;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet
		HashSet hs = new HashSet();
		hs.add("monitor");
		hs.add("keyboard");
		hs.add("mouse");
		hs.add("speakers");
		System.out.println(hs.add("ups"));
		System.out.println(hs);
		
		//LinkedHashSet
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("monitor");
		lhs.add("keyboard");
		lhs.add("mouse");
		lhs.add("ups");
		lhs.add("speakers");
		System.out.println(lhs);
		
		//TreeSet
		TreeSet ts = new TreeSet();
		ts.add("monitor");
		ts.add("keyboard");
		ts.add("mouse");
		ts.add("ups");
		ts.add("speakers");
		System.out.println(ts);
		System.out.println(ts.descendingSet());

	}

}
