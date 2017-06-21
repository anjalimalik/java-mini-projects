package Brands;
import Vehicles.Vehicle;
import Vehicles.VehicleImpl;

import Types.OriginType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by malik11 on 4/21/17.
 */
public abstract class Brand {

    public String brandName;
    public List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Brand(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public int getNumVehicles() {
        return vehicleList.size();
    }

    public void addVehicleToList(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }
    public List<Vehicle> getVehiclesList(){
        return vehicleList;
    }

    public Vehicle getFastestVehicle() {
        float topspeed = 0;
        Vehicle fastest = vehicleList.get(0);


        for (Vehicle vehicle : vehicleList) {
            if(topspeed < vehicle.getTopSpeed()) {
                topspeed = vehicle.getTopSpeed();
                fastest = vehicle;
            }
        }
        return fastest;
    }

    public abstract OriginType getBrandOrigin();
    public abstract void createVehicleList();

}
