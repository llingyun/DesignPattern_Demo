package demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test3 {
	public static void main(String[] args) {
		List<Apple> appleList = new ArrayList<>();// 存放apple对象集合

		Apple apple1 = new Apple(1, "苹果1", new BigDecimal("3.25"), 10);
		Apple apple2 = new Apple(20, "香蕉", new BigDecimal("2.89"), 30);
		Apple apple3 = new Apple(3, "荔枝", new BigDecimal("9.99"), 10);
		Apple apple4 = new Apple(4, "苹果2", new BigDecimal("1.35"), 10);
		appleList.add(apple1);
		appleList.add(apple2);
		appleList.add(apple3);
		appleList.add(apple4);
		/* Map<Integer,String> map1 =
		 appleList.stream().collect(Collectors.toMap(e ->e.getId(), e ->
		 e.getName()));
		BigDecimal totalMoney = appleList.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);*/
		Map<Integer, Apple> map11 = appleList.stream().collect(Collectors.toMap(Apple :: getId, e -> e));
		Map<Integer, List<Apple>> map = appleList.stream().collect(Collectors.groupingBy(Apple::getNum));
		//List<Apple> hh = appleList.parallelStream().sorted(comparing(Apple :: getId).reversed()).collect(Collectors.toList());
		List<Apple> personList2 = appleList.stream().sorted((p1, p2) -> p1.getId().compareTo(p2.getId())).collect(Collectors.toList());
		List<BigDecimal> money = map.values().stream()
				.map(e -> e.stream().map(Apple::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add))
				.collect(Collectors.toList());
		int sum = appleList.stream().mapToInt(Apple::getNum).sum();
		//System.out.println(money);
		
		Map<Boolean, String> nnn = new HashMap<>();
		nnn.put(true, "hxjcd");
		nnn.put(true, "hdjfsd");
		System.out.println(personList2);
	}

}
 class Apple {
    private Integer id;
    private String name;
    private BigDecimal money;
    private Integer num;
   
    public Apple(){
    	
    }
    
    public Apple(Integer id, String name, BigDecimal money, Integer num) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.num = num;
    }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
}