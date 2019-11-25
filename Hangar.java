public class Hangar{
	
	public static void main(String[] args) {

		Car vehicle1 = new Car("Mondeo");
		System.out.println(vehicle1.doStuff());
		
		Car vehicle2 = new Car("Ferrari");
		System.out.println(vehicle2.doStuff());

		Boat vehicle3 = new Boat("Strolch");
		System.out.println(vehicle3.doStuff());
			
		Boat vehicle4 = new Boat("Rheinpfeil");
		System.out.println(vehicle4.doStuff());

	}
	
}
