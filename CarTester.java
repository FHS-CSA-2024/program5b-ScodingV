import java.util.Scanner;

public class CarTester {
    public static Car addCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the car's name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter cars miles: ");
        int miles = scanner.nextInt();

        System.out.print("Please enter cars gallons: ");
        int gallons = scanner.nextInt();

        return new Car(name, miles, gallons);
    }

    public static void main(String[] args) {
        Car car1 = addCar();
        System.out.println(car1.toString());

        System.out.println("------NEXT CAR-------------------------------------------");

        Car car2 = addCar();
        System.out.println(car2.toString());
    }
}
