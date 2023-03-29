package mypackage;
import java.util.*;

public class GeneriClollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>();
		//al.add(10);//error
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		System.out.println(al);
		for(String s:al)
			System.out.println(s);

	}

}
