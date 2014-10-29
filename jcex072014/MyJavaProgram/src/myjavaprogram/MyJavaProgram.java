package myjavaprogram;
public class MyJavaProgram {
    public static void main(String[] args) {
        Car car = new Car(); 
        car.make = "BMW";
        System.out.println(car.make);
        System.out.println(Car.wheels);
    }
}
