package demo;

public class testKmp {
	
	public static void main(String[] args) {
		KmpMatch test = new KmpMatch();
		String ptr = "ababaca";
		String str = "bacbababadababacambabacaddababacasdsd";
		int result = test.kmp(str, ptr);
		System.out.println("匹配的位置为" + result);
	}
}
