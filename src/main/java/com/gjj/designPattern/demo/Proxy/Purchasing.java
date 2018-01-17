package com.gjj.designPattern.demo.Proxy;

public class Purchasing implements IShop {
	
	private  IShop mshop;
	
	public Purchasing(IShop shop){
		this.mshop = shop;
		
	}

	@Override
	public void buy() {
		mshop.buy();
	}

}
