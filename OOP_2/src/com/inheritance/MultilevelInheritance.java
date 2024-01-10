package com.inheritance;

class Car{
	private String engineType = "Diesel";
	public String getEngineType() {
		return this.engineType;
	}
}

class FourWheeler extends Car{
	private int numberOfWheels = 4;
	public int getWheels() {
		return this.numberOfWheels;
	}
}

class Audi extends FourWheeler{
	private String brandName = "Audi";
	public String getBrandName() {
		return this.brandName;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Audi audi = new Audi();
		System.out.println(audi.getBrandName());
		System.out.println(audi.getWheels());
		System.out.println(audi.getEngineType());

	}

}
