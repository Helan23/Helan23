import java.util.Scanner;

class Farm {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int chickhens;
        int pigs;
        int cows;
        System.out.println("Enter the number of chickhens");
        chickhens = in.nextInt();
        System.out.println("Enter the number of pigs");
        pigs = in.nextInt();
        System.out.println("Enter the number of cows");
        cows = in.nextInt();
        int number = (chickhens * 2) + (pigs * 4) + (cows * 4);
        System.out.println("The number of legs are " + number);
        in.close();
    }
}