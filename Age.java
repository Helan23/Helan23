import java.util.Scanner;

class Age {
    public static void main(String args[]) {
        int age, days;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age");
        age = in.nextInt();
        days = age * 365;
        System.out.println("The days are " + days);
        in.close();
    }
}