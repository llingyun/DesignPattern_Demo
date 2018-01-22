package com.gjj.designPattern.demo.decorator;

/**
 * 装饰者具体实现类（ConcreteDecorator）
 * @author lenovo
 *
 */
public class HongQiGong extends Master {

	public HongQiGong(AbstractSwordsman swordsman) {
		super(swordsman);
		
	}
	
	public void teachAttackMagic(){
		System.out.println("洪七公教你打狗棒法");
		System.out.println("杨过学习打狗棒法");
	}
	
	@Override
	public void attackMagic(){
		super.attackMagic();
		teachAttackMagic();
	}

}
