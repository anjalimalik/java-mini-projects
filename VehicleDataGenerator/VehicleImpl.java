package Vehicles;

import Types.EngineType;

/**
 * Created by anjalimalik
 */

public class VehicleImpl implements Vehicle{
    String vehicleName;
    EngineType engineType;
    float topSpeed;

    public VehicleImpl(String vehicleName, EngineType engineType, float topSpeed){
        this.vehicleName = vehicleName;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public float getTopSpeed(){
        return topSpeed;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
