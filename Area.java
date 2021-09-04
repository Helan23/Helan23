import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        double length, width, area, perimeter;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        length=in.nextDouble();
        System.out.println("Enter the width");
        width=in.nextDouble();
        //area
        area= length*width;
        //perimeter
        perimeter=2*(length+width);
        //print area and perimeter
        System.out.println("The area of rectangle is "  +area);
        System.out.println("The perimeter of rectangle is "+perimeter);
        in.close();
    }
}
