package Brands;

import Types.OriginType;
import Vehicles.Vehicle;

import java.util.*;

/**
 * Created by malik11 on 4/21/17.
 */
public class Audi extends Brand {
    public Audi(){
        super(Types.BrandNames.AUDI.name());
    }

    public OriginType getBrandOrigin() {
        return  Types.OriginType.GERMANY;
    }

    public void createVehicleList(){

        Vehicles.VehicleDataGenerator obj = new Vehicles.VehicleDataGenerator();
        vehicleList.addAll(obj.getAudiCars());

    }
}
