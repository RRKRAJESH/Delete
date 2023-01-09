package com.delete;

public abstract class Abstract1 implements Interface1,Interface2,Interface3 {
	
	@Override
	public void interfaceSample1() {
		System.out.println("interfaceSample1");
	}
	
	@Override
	public void interfaceSample2() {
		
		System.out.println("interfaceSample2");

		
	}
	
	@Override
	public void interfaceSample3() {
		System.out.println("interfaceSample3");
		
	}
	
	public void abstractSample1() {
		System.out.println("abstractSample1");
	}


}
