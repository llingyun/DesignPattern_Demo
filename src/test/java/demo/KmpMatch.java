package demo;

/**
 * kmp匹配算法简单的demo
 * @author lly
 *
 */
public class KmpMatch {
	
	public int kmp(String str, String ptr) {
		if (str != null && ptr != null) {
			char[] ptr_chars = ptr.toCharArray();
			char[] str_chars = str.toCharArray();
			int[] next = new int[ptr_chars.length];
			cal_next(ptr_chars, next);
			int k = -1;
			for (int i = 0; i < str_chars.length; i++) {
				while (k > -1 && ptr_chars[k + 1] != str_chars[i]) {
					k = next[k];
				}
				if (ptr_chars[k + 1] == str_chars[i])
					k = k + 1;
				if (k == ptr_chars.length - 1)
					return i - ptr_chars.length + 1;
			}
		}
		return -1;
	}

	/**
	 * 计算next数组
	 * @param str 子字符串
	 * @param next
	 */
	public void cal_next(char[] ptr, int[] next) {
		next[0] = -1;
		int k = -1;
		for (int q = 1; q <= ptr.length - 1; q++) {

			while (k > -1 && ptr[k + 1] != ptr[q]) {
				k = next[k];// 往前回溯
			}
			if (ptr[k + 1] == ptr[q])
				k = k + 1;
			next[q] = k;
		}
		for (int i : next) {
			System.out.println(i + ",");
		}

	}

}
