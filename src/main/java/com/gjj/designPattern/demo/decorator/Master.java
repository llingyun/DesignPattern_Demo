package com.gjj.designPattern.demo.decorator;

/**
 * 抽象装饰者（Decorator）
 * @author lenovo
 *
 */
public class Master extends Swordsman {

	private Swordsman swordsman;
	
	public Master(Swordsman swordsman) {
		this.swordsman = swordsman;
	}
	
	@Override
	public void attackMagic() {
		swordsman.attackMagic();

	}

}
