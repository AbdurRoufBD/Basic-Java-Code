import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {

        // if I want to sum this series
        // (1/3) + (3/5) + (5/7) + (7/9) + (9/11)
        // then I will enter 11
        //--------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the denominator of Last term : ");
        int n = sc.nextInt();
        //--------------------------------------------


        double sum = 0;

        for(int i = 3; i <= n ; i=i+2)
        {
            sum = (i-2)/((i)*1.0);
        }

        System.out.println("Summation is : "+sum);

    }
}
