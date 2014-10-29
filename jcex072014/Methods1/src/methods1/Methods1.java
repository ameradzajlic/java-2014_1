package methods1; 
public class Methods1 { 
    public static void main(String[] args) { 
        Car car = new Car(); 
        car.make = "Wolkswagen";
        car.model = "Beetle";
        car.numDoors = 4;
        car.printDetails();
        
        System.out.println(car.model); 
        Car.HowManyWheels(); 
    } 
}
