package factory;
interface Vehicle{
    void drive();
}

class TwoWheelVehicle implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Two Wheel Vehicle");
    }
}

class FourWheelVehicle implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Four Wheel Vehicle");
    }
}

class ThreeWheelVehicle implements Vehicle{

    @Override
    public void drive() {
        System.out.println("Driving Three Wheel Vehicle");
    }
}

class VehicleFactory{
    public Vehicle getVehicle(String vehicleType) throws InvalidVehicleType {
        if (vehicleType == null || vehicleType.isEmpty()){
            throw new InvalidVehicleType("Not valid vehicle:( ");
        }
        return switch (vehicleType){
            case "Three" -> new ThreeWheelVehicle();
            case "Four" -> new FourWheelVehicle();
            case  "Two" -> new TwoWheelVehicle();
            default -> throw new InvalidVehicleType("Not Valid Vehicle "+vehicleType);
        };

    }
}
public class VehicleClient {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        try {
            Vehicle vehicle = factory.getVehicle("Two");
            vehicle.drive();
        } catch (InvalidVehicleType e) {
            System.out.println(e.getMessage());
        }
    }
}
