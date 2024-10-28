package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //moped
        Moped slowRide = new Moped();
        slowRide.setModel("FastWorum");
        slowRide.setColor("Pink");
        slowRide.setTopSpeed(130);
        slowRide.setFuelCapacity(20);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(1);//from parent
        slowRide.setMaxWeight(350); //from child

        //car
        Car coupeCar = new Car();
        coupeCar.setModel("330e");
        coupeCar.setColor("blue");
        coupeCar.setTopSpeed(320);
        coupeCar.setFuelCapacity(20);
        coupeCar.setNumberOfPassengers(2);
        coupeCar.setCargoCapacity(1);
        coupeCar.setNumberOfDoors(2);

        //semi truck
        SemiTruck truck = new SemiTruck();
        truck.setModel("pensky");
        truck.setColor("white");
        truck.setTopSpeed(100);
        truck.setFuelCapacity(200);
        truck.setNumberOfPassengers(3);
        truck.setCargoCapacity(100);
        truck.setNumberOfTrailers(1);

        //hover craft
        HoverCraft craft = new HoverCraft();
        craft.setModel("carfty");
        craft.setColor("black");
        craft.setTopSpeed(130);
        craft.setFuelCapacity(100);
        craft.setNumberOfPassengers(2);
        craft.setCargoCapacity(50);
        craft.setAirCushionPressure(20);

    }
}
