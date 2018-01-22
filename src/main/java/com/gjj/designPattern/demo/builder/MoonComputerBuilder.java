package com.gjj.designPattern.demo.builder;

public class MoonComputerBuilder extends Builder {

	   private Computer mComputer = new Computer();
	
	@Override
	public void buildCpu(String cpu) {
		mComputer.setmCpu(cpu);	
	}

	@Override
	public void buildMainboard(String mainboard) {
		mComputer.setmMainBoard(mainboard);
	}

	@Override
	public void buildRam(String ram) {
		mComputer.setmRam(ram);
	}

	@Override
	public Computer create() {
		return mComputer;
	}

}
