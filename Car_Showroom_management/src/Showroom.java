import java.util.Scanner;

public class Showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    @Override
    public void getDetails(){
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: " + showroom_address);
        System.out.println("Total Employees: " + total_employees);
        System.out.println("Total Cars in stock: " + total_cars_in_stock);
        System.out.println("Manager Name: " + manager_name);
    }

    @Override
    public void setDetails(){
        Scanner input = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = input.nextLine();
        System.out.print(("SHOWROOM ADDRESS: "));
        showroom_address = input.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = input.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_employees = input.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = input.nextInt();
    }
}
