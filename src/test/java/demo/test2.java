package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test2 {
	public static void main(String[] args){
		/*String dd = null;
		dd = "dd";
		System.out.println(dd);
		String hh = "hh";
		System.out.println(hh);*/
		List<Integer> list = new  ArrayList<>();
		Integer number = list.stream().filter(e -> e.equals(5)).findFirst().orElse(3);
		System.out.println(number);
		List<Integer> list1 = Arrays.asList(1,3);
		List<Person> list2 = new ArrayList<>();
		Person p1 = new Person(12);
		p1.setName("sanzhang");
		Person p2 = new Person(16);
		p2.setName("lisi");
		Person p3 = new Person(16);
		p3.setName("wangwu");
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
	//	Map<Integer, String> map = list2.stream().collect(Collectors.toMap( e -> e.getAge(), e -> e.getName()));
		//System.out.println(map);
		//Map<String, Person> nn = list2.stream().collect(Collectors.groupingBy(classifier))
		List<Person> list11 = new ArrayList<>();
		Person kk = list11.stream().filter(e -> e.getAge() > 100).findFirst().orElse(null);
		System.out.println("kk的值为:"+ kk);
		
		
	}
}

class Person {
	String name;
	int age;
    public Person (){
    	
    }
	public Person(int age) {
      this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
