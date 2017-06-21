package Brands;

import Types.OriginType;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dodge extends Brand{

    public Dodge(){
        super(Types.BrandNames.DODGE.name());
    }

    public OriginType getBrandOrigin() {
        return Types.OriginType.UNITED_STATES;
    }

    public void createVehicleList(){

        Vehicles.VehicleDataGenerator obj = new Vehicles.VehicleDataGenerator();
        vehicleList.addAll(obj.getDodgeCars());

    }


}
