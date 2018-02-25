package demo;


import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;

public class test4 {
	@SuppressWarnings("unchecked")
	public static void main(String [] args) {
		
		JSONArray json = new JSONArray();
		json.add(0, "hh");
		json.add(1, "hh");
		json.add(2, "hh1");
		json.add(3, "hh233");
		json.stream().forEach(e  -> System.out.println(e));
		
		 List<String> list = new ArrayList<>();
	//	System.out.println(list.stream().findFirst().orElse(null));
		
		String hh = "a,b,,c";
		String [] chuan = hh.split(",");
		System.out.println(chuan.length);
	}

}
