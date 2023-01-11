package array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class LearnHashMap {

	public static void main(String[] args) {
		//HashMap -->It stores key value pair
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "vino");
		map.put(2, "gayu");
		map.put(3, "selvi");
		
     System.out.println("The Data of HashMap is :"+map);
     
     Set<Map.Entry<Integer,String>> hashMap=map.entrySet();
     
     for (Entry<Integer, String> entry : hashMap) {
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
     
     
     
    
	}

}
