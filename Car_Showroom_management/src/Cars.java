import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void getDetails(){
        System.out.println("NAME: "+car_name);
        System.out.println("COLOR: "+car_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION: "+car_transmission);
    }

    @Override
    public void setDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name = input.nextLine();
        System.out.print(("CAR COLOR: "));
        car_color = input.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = input.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = input.nextInt();
        input.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_type = input.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission = input.nextLine();
        total_cars_in_stock++;
    }
}
