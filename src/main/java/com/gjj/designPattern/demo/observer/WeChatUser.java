package com.gjj.designPattern.demo.observer;

public class WeChatUser implements Observer {

	private String name;

	public WeChatUser(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + "_" + message);
	}

}
