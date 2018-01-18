package com.gjj.designPattern.demo.decorator;

public class client {
	 public static void main(String[] args){
	        YangGuo mYangGuo=new YangGuo();
	        HongQiGong mHongQiGong=new HongQiGong(mYangGuo);
	        mHongQiGong.attackMagic();
	        OYangFeng mOuYangFeng=new OYangFeng(mYangGuo);
	        mOuYangFeng.attackMagic();
	    }
}
