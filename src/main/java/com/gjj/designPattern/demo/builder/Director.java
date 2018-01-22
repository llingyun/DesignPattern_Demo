package com.gjj.designPattern.demo.builder;

public class Director {

	Builder mBuilder = null;
	
	public Director(Builder builder) {
		this.mBuilder = builder;
	}
	
	public Computer createComputer(String cpu, String mainboard, String ram) {
		this.mBuilder.buildCpu(cpu);
		this.mBuilder.buildMainboard(mainboard);
		this.mBuilder.buildRam(ram);
		return mBuilder.create();
	}
}
