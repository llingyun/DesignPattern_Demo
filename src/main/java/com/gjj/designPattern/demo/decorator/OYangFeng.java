package com.gjj.designPattern.demo.decorator;

/**
 * 装饰者具体实现类（ConcreteDecorator）
 * @author lenovo
 *
 */
public class OYangFeng extends Master {

	public OYangFeng(AbstractSwordsman swordsman) {
		super(swordsman);
	}
	
	public void teachAttackMagic(){
		 System.out.println("欧阳锋教你蛤蟆功");
		 System.out.println("杨过练习蛤蟆功");
	}
	
	@Override
	public  void attackMagic() {
		super.attackMagic();
		teachAttackMagic();
	}

}
