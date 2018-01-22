package com.gjj.designPattern.demo.builder;

/**
 * Product: 产品类
 * @author lenovo
 * 组装一台电脑，电脑被抽象为Computer类，
 * 它有三个部件:CPU 、主板和内存。
 * 并在里面提供了三个方法分别用来设置CPU 、主板和内存：
 *
 */
public class Computer {
	
	private String mCpu;
	private String mMainBoard;
	private String mRam;
	
	public void setmCpu(String mCpu) {
		this.mCpu = mCpu;
	}
	public void setmMainBoard(String mMainBoard) {
		this.mMainBoard = mMainBoard;
	}
	public void setmRam(String mRam) {
		this.mRam = mRam;
	}
	
	

}
