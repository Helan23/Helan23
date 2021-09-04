import java.util.Scanner;

class Minute {
    public static void main(String args[]){
        int min,sec;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the minute");
        min=in.nextInt();
        sec=min*60;
        System.out.println("The seconds is "+sec);
        in.close();
    }
    
}
