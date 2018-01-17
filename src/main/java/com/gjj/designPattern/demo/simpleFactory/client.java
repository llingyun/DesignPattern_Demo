package com.gjj.designPattern.demo.simpleFactory;

public class client {
	public static void main(String [] args) {
		
		ComputerFactory.createComputer("hp").start();
	}

}
