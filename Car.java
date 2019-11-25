    // new class
    public class Car extends Vehicle {    	
    	// Constructor
        public Car(String brand) {  
            super(brand);  
        }       
        @Override
        public String doStuff() {
            return "I am " + getBrand() + " and I go zoom zoom zoom!";
        }        
    }

