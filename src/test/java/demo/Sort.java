package demo;

import java.util.Arrays;
import java.util.List;

public class Sort {
	
	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(50,10,90,30,70,40,80,60,20);
		//data.stream().forEach(System.out :: print);
		for (Integer dd : data) {
			System.out.print(dd + " ");
		}
		System.out.println("");
		Integer[] dataSorted = (Integer[])data.toArray();
		dataSorted = quickSort(dataSorted, 0, dataSorted.length - 1);
		for(Integer cell : dataSorted) {
			System.out.print(cell + " " );
		}
	}
	
	public static Integer[] quickSort(Integer[] data, Integer low, Integer high ) {
		Integer pivot;
		if (low < high) {
			pivot = partition(data, low, high);
			quickSort(data, low, pivot);
			quickSort(data, pivot + 1, high);
		}
		return data;
	}
	
	private static Integer partition(Integer[] data, Integer low, Integer high) {
		int pivotKey = data[low];
		while (low < high) {
			while (low < high && data[high] >= pivotKey) 
				high--;
			swap(data, low, high);
			while(low <high && data[low] <= pivotKey)
				low++;
			swap(data, low, high);
		}
		return low;
	}
	
	public static Integer[] swap(Integer[] data, Integer low, Integer high) {
		if (data.length >= 2) {
			int temp = data[high];
			data[high] = data[low];
			data[low] = temp;
		}
		return data;
	}
}
