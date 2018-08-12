package com.gjj.designPattern.demo.builder;

public class CreateComputer {
	
	public static void main(String [] args) {
		   Builder mBuilder = new MoonComputerBuilder();
	       Director mDirector = new Director(mBuilder);
	        //组装电脑
	        mDirector.createComputer("i7-6700","华擎玩家至尊","三星DDR4");
	}

}
