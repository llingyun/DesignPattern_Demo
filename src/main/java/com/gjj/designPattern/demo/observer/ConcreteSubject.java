package com.gjj.designPattern.demo.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	
	private List<Observer> weChatUsers = new ArrayList<Observer>();

	@Override
	public void attach(Observer observer) {
		weChatUsers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		weChatUsers.remove(observer);
		
	}

	@Override
	public void notify(String message) {
		for(Observer  observer : weChatUsers) {
			observer.update(message);
		}
		
	}
	
	

}
