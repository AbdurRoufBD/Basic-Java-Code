package A3_p4;

import java.util.Scanner;

public class A3_p4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Location location = new Location(x,y);
        location.InsertLocation();
        location.getLargestLocation();
    }
}
