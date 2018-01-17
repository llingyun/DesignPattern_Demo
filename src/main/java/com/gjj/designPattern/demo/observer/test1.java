package com.gjj.designPattern.demo.observer;

public class test1 {
	
	public static void main(String[] args) {
		
		WeChatUser user1 = new WeChatUser("xiaohong");
		WeChatUser user2 = new WeChatUser("xiaogang");
		WeChatUser user3 = new WeChatUser("xiaoming");
		ConcreteSubject con = new ConcreteSubject();
		con.attach(user1);
		con.attach(user2);
		con.attach(user3);
		con.notify("你们都被选中了！");
				
	}

}
