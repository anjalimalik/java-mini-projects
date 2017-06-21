import Brands.*;
import Types.EngineType;
import Vehicles.Vehicle;
import Vehicles.VehicleImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * VehicleShowroom - Vehicle Showroom (Main class for the lab)
 *
 * @author Sahil Pujari (pujari@purdue.edu)
 * @author Tori Shurman (vshurman@purdue.ede)
 */
public class VehicleShowroom {

    private List<Brand> brandList;

    public VehicleShowroom() {
        brandList = new ArrayList<>();
    }

    /**
     * Get list of all brands in the showroom
     * @return List: list of all brands
     */
    public List<Brand> getBrandList() {
        return brandList;
    }

    /**
     * Adds a brand to the list
     * @param brand: the given brand
     */
    public void addBrandToList(Brand brand) {
        brandList.add(brand);
    }


    public static void main(String[] args) {
        VehicleShowroom room = new VehicleShowroom();
        Brand[] brands = new Brand[4];
        brands[0] = new Audi();
        brands[1] = new Dodge();
        brands[2] = new Maserati();
        brands[3] = new Mazda();

        for (int i = 0; i < 4; i++) {
            brands[i].createVehicleList();
            room.addBrandToList(brands[i]);
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the vehicle showroom. Select one of the options below to begin.");
        while (true) {
            System.out.print("Main Menu:\n" +
                    "1. View all brands in the showroom\n" +
                    "2. View more details about a particular brand\n" +
                    "3. Exit.\n");
            int option = s.nextInt();

            switch(option) {
                case 1:
                    List<Brand> brandList = room.getBrandList();
                    System.out.println("\nCurrently showcased brands:");
                    for (Brand brand : brandList) {
                        System.out.println(brand.getBrandName());
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nEnter the name of the brand you would like to view.");
                    s.nextLine();
                    String brand = s.nextLine();
                    switch (brand.toLowerCase()) {
                        case "audi":
                            room.showroom(brands[0]);
                            break;
                        case "dodge":
                            room.showroom(brands[1]);
                            break;
                        case "maserati":
                            room.showroom(brands[2]);
                            break;
                        case "mazda":
                            room.showroom(brands[3]);
                            break;
                        default:
                            System.out.println("That brand is not available. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting");
                    s.close();
                    return;
                default:
                    System.out.println("Not a valid option. Please try again.\n");
            }
        }
    }

    private void showroom(Brand brand) {
        String name = brand.getBrandName();
        System.out.printf("\nThank you for your interest in %s.\nPlease choose an option.\n", name);

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("%s Showroom:\n" +
                    "1. See the number of vehicles for sale\n" +
                    "2. Add a vehicle to the list\n" +
                    "3. See all of the %s vehicles for sale\n" +
                    "4. Get the fastest %s for sale\n" +
                    "5. Get the brand origin of %s\n" +
                    "6. Exit to main menu.\n",
                    name, name, name, name);
            int option = s.nextInt();

            switch (option) {
                case 1:
                    int numVehicles = brand.getNumVehicles();
                    System.out.printf("\nNumber of %s vehicles for sale: %d\n\n", name, numVehicles);
                    break;
                case 2:
                    System.out.println("\nWhat is the model of the vehicle?");
                    s.nextLine();
                    String model = s.nextLine();

                    int engineType = -1;
                    EngineType type;
                    while (engineType != 1 && engineType != 2) {
                        System.out.println("Select the engine type:\n" +
                                "1. Straight\n" +
                                "2. V-type");
                        engineType = s.nextInt();

                        if (engineType != 1 && engineType != 2) {
                            System.out.println("Invalid engine type. Try again\n.");
                        }
                    }
                    switch (engineType) {
                        case 1:
                            type = EngineType.Straight;
                            break;
                        case 2:
                        default:
                            type = EngineType.V_TYPE;
                    }

                    System.out.println("\nWhat is the top speed of the vehicle?");
                    float topSpeed = s.nextFloat();

                    Vehicle vehicle = new VehicleImpl(model, type, topSpeed);
                    brand.addVehicleToList(vehicle);
                    System.out.println("The vehicle was added to the list\n\n");
                    break;
                case 3:
                    List<Vehicle> vehicles = brand.getVehiclesList();
                    System.out.printf("\nPrinting all %s vehicles\n", name);
                    for (Vehicle v : vehicles) {
                        System.out.printf("Name: %s\nEngine type: %s\nTop Speed: %.2f\n\n", v.getVehicleName(), v
                                .getEngineType().name(), v.getTopSpeed());
                    }
                    System.out.println();
                    break;
                case 4:
                    Vehicle fastest = brand.getFastestVehicle();
                    System.out.printf("\nFastest %s in stock:\nName: %s\nEngine Type: %s\nTop Speed: %.2f\n\n",
                            name, fastest.getVehicleName(), fastest.getEngineType().name(), fastest.getTopSpeed());
                    break;
                case 5:
                    System.out.printf("\nBrand origin: %s\n\n", brand.getBrandOrigin());
                    break;
                case 6:
                    System.out.println("Exiting to main menu\n");
                    return;
                default:
                    System.out.println("Not a valid option. Please try again.\n");
            }
        }
    }
}
