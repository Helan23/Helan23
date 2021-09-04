import java.util.Scanner;

public class Vehicle {
    double needed;
    double minimum;
    double n;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the distance");
        n = in.nextInt();
        in.close();
    }

    double calculatefuel() {
        needed = n * 10;
        minimum = 100;
        return Math.max(minimum, needed);
    }

}

class Fuel {
    public static void main(String args[]) {
        Vehicle v1 = new Vehicle();
        v1.input();
        double a = v1.calculatefuel();
        System.out.println("The fuel is " + a);
    }
}