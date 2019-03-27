import java.util.Scanner;

public class p1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines 1 to 15 : ");
        int nLine = sc.nextInt();

        for(int i = 0; i < nLine ; i++)
        {
            for(int j = 0; j < nLine-i-1; j++)
            {
                System.out.print("\t");
            }

            int temp = i+1;
            for(int j = 0 ; j < i+1 ; j++)
            {
                System.out.print(temp+"\t");
                temp--;
                if(temp == 0 ) break;
            }

            temp = 2;
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print(temp+"\t");
                temp++;
            }

            System.out.print("\n");

        }


    }
}
