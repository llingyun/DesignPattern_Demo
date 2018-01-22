package com.gjj.designPattern.demo.decorator;

/**
 * 抽象装饰者（Decorator）
 * @author lenovo
 *
 */
public class Master extends AbstractSwordsman {

	private AbstractSwordsman swordsman;
	
	public Master(AbstractSwordsman swordsman) {
		this.swordsman = swordsman;
	}
	
	@Override
	public void attackMagic() {
		swordsman.attackMagic();

	}

}
