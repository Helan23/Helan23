import java.util.Scanner;

public class Farm1 {
    int x;
    int y;
    int sum;

    void count() {
        System.out.println("Enter cows and pigs");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        in.close();
    }

    int total() {
        sum = 4 * (x + y);
        return sum;
    }
}

class Animal {
    public static void main(String[] args) {
        Farm1 f1 = new Farm1();
        f1.count();
        int a = f1.total();
        System.out.println("The result is " + a);
    }
}
