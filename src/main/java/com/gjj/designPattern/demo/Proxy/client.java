package com.gjj.designPattern.demo.Proxy;

public class client {
	
	public static void main(String [] args) {
		IShop zhangsan = new ZhangSan();
		IShop purchasing = new Purchasing(zhangsan);
		purchasing.buy();
	}

}
