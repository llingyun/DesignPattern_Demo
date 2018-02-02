package demo;

public class test_Kmp {
	
	public static void main(String[] args) {
		test_Kmp test = new test_Kmp();
		String dd = "ababaca";
		char [] shuzu = dd.toCharArray();
		int [] next = new int[shuzu.length];
		test.cal_next(shuzu, next);
		
	}
	
	public int kmp(String str, String ptr) {
		if (str != null && ptr != null) {
			char[] pchuan = ptr.toCharArray();
			char[] dd = new char[str.toCharArray().length];
			int[] next = new int[pchuan.length];
			cal_next(pchuan, next);
			int k = -1;
			for (int i = 0; i < dd.length; i++) {
				while (k > -1 && pchuan[k + 1] != dd[i]) {
					k = next[k];
				}
				if (pchuan[k + 1] == dd[i])
					k = k + 1;
				if (k == pchuan.length - 1)
					return i - pchuan.length + 1;
			}

		}
		return -1;
	}
	
    public void cal_next(char[] str, int[] next) {
    	
    	next[0] = -1;
    	int k = -1;
    	for(int q = 1; q <= str.length - 1; q++) {
    		
    		while(k > -1 && str[k + 1] != str[q]) {
    			k = next[k];//往前回溯
    		}
    		if(str[k + 1] == str[q]) 
    			k =k +1;
    		next[q] = k;
    	}
    	for(int i : next) {
    		System.out.print(i + ",");
    	}
    	
    }

}
