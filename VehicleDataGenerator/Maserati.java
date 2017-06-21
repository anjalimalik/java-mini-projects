package Brands;

import Types.OriginType;
import Vehicles.Vehicle;

import java.util.ArrayList;

/**
 * Created by malik11 on 4/21/17.
 */
public class Maserati extends Brand {
    public Maserati(){
        super(Types.BrandNames.MASERATI.name());
    }

    public OriginType getBrandOrigin() {
        return  Types.OriginType.ITALY;
    }

    public void createVehicleList(){

        Vehicles.VehicleDataGenerator obj = new Vehicles.VehicleDataGenerator();
        vehicleList.addAll(obj.getMaseratiCars());
    }

}
