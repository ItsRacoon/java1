public class vehicle 
{ 
 int no_of_seats; 
 int no_of_wheels; 
 public vehicle(int numseats, int numwheels) 
 { 
 this.no_of_seats = numseats; 
 this.no_of_wheels = numwheels; 
 } 
 public void showVehicle() 
 { 
 System.out.println("Total Number of seats: " + no_of_seats); 
 System.out.println("Total Number of wheels: " + no_of_wheels); 
 } 
 public static void main(String[] args) 
 { 
 vehicle motorcycle = new vehicle(1,2); 
 vehicle car = new vehicle(4,4); 
 System.out.println("Details of Car:"); 
 car.showVehicle(); 
 System.out.println("Details of Motorcycle:"); 
 motorcycle.showVehicle(); 
 } 
} 