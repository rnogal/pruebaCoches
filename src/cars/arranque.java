package cars;

public class arranque {

	
	public static void main(String[] arguments) {
		CarFactory factoriaCoches = CarFactory.getInstance();
		Car coche1 = factoriaCoches.createCar("Citroen", "C2", 3, 67, "gris");
		Car coche2 = factoriaCoches.createCar("Renault", "Scenic", 5, 130, "gris ceniza");
		

		System.out.println(coche1.toString());
		System.out.println(coche2.toString());
		
	}
}
