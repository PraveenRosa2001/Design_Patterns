abstract class Vehicle {
    abstract void ShowSpec();
}

class IndianAlto extends Vehicle {
    @Override
    public void ShowSpec() {
        System.out.println("See the Specification of Indian Alto");
    }
}

class MitsubishiLancer extends Vehicle { // Missing closing brace here  - fixed
    @Override
    public void ShowSpec() {
        System.out.println("See the specification of Mitsubishi Lancer");
    }
}

class Benz extends Vehicle {
    @Override
    public void ShowSpec() {
        System.out.println("See the specification of Benz");
    }
}

class FactoryVehicle {
    public Vehicle getVehicle(String TypeOfVehicle) {
        if (TypeOfVehicle.equalsIgnoreCase("Low Price")) {
            return new IndianAlto();
        }
        if (TypeOfVehicle.equalsIgnoreCase("Middle range price")) {
            return new MitsubishiLancer();
        }
        if (TypeOfVehicle.equalsIgnoreCase("Expensive")) {
            return new Benz();
        }
        return null;
    }
}

public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        FactoryVehicle factoryVehicle = new FactoryVehicle();

        Vehicle myVehicle = factoryVehicle.getVehicle("Low price");
        myVehicle.ShowSpec();
    }
}

