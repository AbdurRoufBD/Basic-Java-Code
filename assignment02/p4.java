import java.util.Scanner;
import java.util.Stack;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int n = sc.nextInt();

        //-----------conversion---------------

        int temp = n;
        int[] arr = new int[64];

        int i = 0;
        while(true)
        {
            arr[i] = temp%2;
            temp = temp/2;
            i++;

            if(temp == 0) break;
        }

        i--;

        for(;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }
}
