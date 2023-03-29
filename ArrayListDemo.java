package mypackage;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("xxx");
		al.add("yyy");
		System.out.println(al);
		al.add(2,"ppp");
		System.out.println(al);
		al.set(2, "qqq");
		System.out.println(al);
		al.remove("qqq");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		String s = (String)al.get(2);
		System.out.println(s);
		System.out.println("Size :" + al.size());

	}

}
