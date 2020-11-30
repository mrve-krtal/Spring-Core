package _01.decoupled.model;

public class Car implements Vehicle {

	public Wheel wheel;
	
	@Override
	public void setWheel(Wheel wheel) {
		this.wheel=wheel;
		
	}

	@Override
	public void drive() {
		wheel.useTire();
	}

}
