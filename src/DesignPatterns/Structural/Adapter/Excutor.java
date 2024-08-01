
package DesignPatterns.Structural.Adapter;

public class Excutor {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(car);
        useVehicle(bike);
    }
    public static void useVehicle(Vehicle vehicle){
        vehicle.accelerate();
        vehicle.soundHorn();
        vehicle.pushBreak();
        System.out.println();
    }
}
