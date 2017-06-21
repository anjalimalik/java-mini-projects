package Vehicles;

/**
 * VehicleDataGenerator - Generates data for each Vehicle Brand
 */
import Types.EngineType;

import java.util.List;
import java.util.ArrayList;
import Vehicles.*;

public class VehicleDataGenerator {

    static VehicleDataGenerator vehicleDataGenerator;

    public static VehicleDataGenerator getInstance() {
        if(vehicleDataGenerator == null)
            vehicleDataGenerator = new VehicleDataGenerator();
        return vehicleDataGenerator;
    }

    /**
     * Get list of all Mazda Cars
     */
    public List<Vehicle> getMazdaCars() {
        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle vehicle1 = new VehicleImpl("Mazda3", EngineType.Straight, 155);
        Vehicle vehicle2 = new VehicleImpl("Mazda CX-9", EngineType.Straight, 133);
        Vehicle vehicle3 = new VehicleImpl("Mazdaspeed MX-5 Miata", EngineType.Straight, 127);
        Vehicle vehicle4 = new VehicleImpl("Mazda RX-8 Spirit R", EngineType.Straight, 158);
        Vehicle vehicle5 = new VehicleImpl("Mazdaspeed 6", EngineType.Straight, 154);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);

        return vehicleList;
    }

    /**
     * Get list of all Audi Cars
     */
    public List<Vehicle> getAudiCars() {
        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle vehicle1 = new VehicleImpl("2017 S7", EngineType.V_TYPE, 155);
        Vehicle vehicle2 = new VehicleImpl("2017 S6", EngineType.V_TYPE, 148);
        Vehicle vehicle3 = new VehicleImpl("2011 R8 Spyder V8", EngineType.V_TYPE, 186);
        Vehicle vehicle4 = new VehicleImpl("R8 V8", EngineType.V_TYPE, 188);
        Vehicle vehicle5 = new VehicleImpl("R8 Spyder V10", EngineType.V_TYPE, 194);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);

        return vehicleList;
    }

    /**
     * Get list of all Dodge Cars
     */
    public List<Vehicle> getDodgeCars() {
        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle vehicle1 = new VehicleImpl("2017 Charger SRT 392", EngineType.V_TYPE, 175);
        Vehicle vehicle2 = new VehicleImpl("Challenger Hellcat", EngineType.V_TYPE, 199);
        Vehicle vehicle3 = new VehicleImpl("Charger Hellcat", EngineType.V_TYPE, 204);
        Vehicle vehicle4 = new VehicleImpl("SRT Viper", EngineType.V_TYPE, 206);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);

        return vehicleList;
    }

    /**
     * Get list of all Maserati Cars
     */
    public List<Vehicle> getMaseratiCars() {
        List<Vehicle> vehicleList = new ArrayList<>();

        Vehicle vehicle1 = new VehicleImpl("2005 Maserati Birdcage 75th Pininfarina Concept", EngineType.Straight, 217);
        Vehicle vehicle2 = new VehicleImpl("2004   Maserati   MC12", EngineType.Straight, 205);
        Vehicle vehicle3 = new VehicleImpl("2006   Maserati   MC12 Corsa", EngineType.Straight, 202);
        Vehicle vehicle4 = new VehicleImpl("2013   Maserati   Quattroporte GTS", EngineType.Straight, 191);
        Vehicle vehicle5 = new VehicleImpl("2014   Maserati   Alfieri Concept", EngineType.Straight, 189);

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);

        return vehicleList;
    }
}
