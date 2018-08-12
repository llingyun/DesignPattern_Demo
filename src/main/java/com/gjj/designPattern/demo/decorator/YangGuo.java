package com.gjj.designPattern.demo.decorator;

/**
 * 组件具体实现类（ConcreteComponent）
 * @author lenovo
 *
 */
public class YangGuo extends AbstractSwordsman{

	@Override
	public void attackMagic() {
		System.out.println("杨过使用全真剑法");
		
	}

}
