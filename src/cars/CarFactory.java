package cars;

public class CarFactory {
	
	private static int numCars = 0;
	private static CarFactory instance;
	
	public static CarFactory getInstance() {
		if (instance == null ) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	private CarFactory() {}
	
	public Car createCar(String marca, String modelo, int numPuertas, int cv, String color) {
		numCars++;
		return new Car(marca, modelo, numPuertas, cv, color);
	}
	
	public int getNunCars() {
		return numCars;
	}

}
