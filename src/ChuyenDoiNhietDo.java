import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exits");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap vao do F:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("F sang C:"+ fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhap vao do C:");
                    celsius = scanner.nextDouble();
                    System.out.println("C sang F:"+ celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0 );
    }
    public static double fahrenheitToCelsius(double celsius){
        double fahrenheit= (9.0 /5)*celsius +32;
        return fahrenheit;
    }
    public static double celsiusToFahrenheit(double fahrenheit){
        double celsius= (5.0 /9)*(fahrenheit -32);
        return celsius;
    }
}
