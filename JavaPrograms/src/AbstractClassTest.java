
abstract class Vehicle {

    int a = 10;
    static String b = "Hello";
    abstract int noOfWheels();
    public int fourWheeler() {
        return 4;
    }


    static int sixWheeler() {
        return 6;
    }
}
public class AbstractClassTest extends Vehicle{
    @Override
    int noOfWheels() {
        return 2;
    }

    public int truckWheels() {
        return 8;
    }
    public static void main(String[] args) {
        Vehicle vehicle = new AbstractClassTest();
        System.out.println(vehicle.fourWheeler());
        System.out.println(vehicle.noOfWheels());
        System.out.println(vehicle.sixWheeler());
        System.out.println(Vehicle.sixWheeler());
        System.out.println(vehicle.a);
        System.out.println(Vehicle.b);
        Vehicle.b = "Hi";
        System.out.println(Vehicle.b);

    }
}
