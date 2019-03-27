import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int idx = 0;
        while(x != 0)
        {
            arr[idx] = x;
            idx++;
            x = sc.nextInt();
        }

        for(int i = 0; i < idx; i++)
        {
            int temp = arr[i];
            if(temp == 0) continue;
            int counter = 1;
            for(int j = 0; j < idx ; j++)
            {
                if(temp == arr[j] && i!=j) {
                    counter++;
                    arr[j] = 0;
                }
                else continue;
            }

            if(counter>1) System.out.println(arr[i]+" occurs "+counter+" times");
            else System.out.println(arr[i]+" occurs "+counter+" time");
        }
    }
}
