    // another class
    public class Boat extends Vehicle {    	
    	// Constructor
        public Boat(String brand) {  
            super(brand);  
        }
        @Override
        public String doStuff() {
            return "I am " + getBrand() + " and I go glug glug!";
        }        
    }    
