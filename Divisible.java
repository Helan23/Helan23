import java.util.Scanner;

class Divisible {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = in.nextInt();
        if (n % 5 == 0) {
            System.out.println("It is divisible");

        } else
            System.out.println("It is not divisible");
        in.close();
    }
}