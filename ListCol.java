package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCol {

	public static void main(String[] args) {
		
				List<String>list= new ArrayList<String>();
			Collections.addAll(list, "red","green","blue","pink","white");
			System.out.println("list : " +list.toString());
			
			Collections.sort(list);
			System.out.println("sorted list :"+list.toString() );
			
			Collections.shuffle(list);
			System.out.println(list.toString());
	}

}
