package _01.coupled.model;

public class Car {
	
	// HAS-A Tire
	private Tire tire;

	public Car() {
		super();
		this.tire = new Tire();
		// coupled
		// Tire ile Car sinifi birbirine coupled durumda. (tight coupled)
	}
	
	public void drive() {
		//
		tire.useTire();
		//
		//
	}

}
