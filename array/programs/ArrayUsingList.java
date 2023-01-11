package array.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUsingList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		Collections.addAll(list,"Vino","gayu","selvi","baskar");
		for (String e:list){
			System.out.println(e);
		}
				
		System.out.println("Data is:"+list);
		System.out.println("Size is :"+list.size());

	}

}
