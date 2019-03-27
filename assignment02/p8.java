import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of student : ");
        int n = sc.nextInt();

        String[] strings = new String[n];
        int[] arr = new int[n];

        //--------------------------input
        for(int i = 0; i < n ; i++)
        {
            System.out.print("Name : ");
            String name = sc.next();
            strings[i] = name;

            System.out.print("Marks : ");
            int marks = sc.nextInt();
            arr[i] = marks;
        }


        //------------------------------sorting

        int temp = 0;
        String tempname;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    tempname = strings[j-1];
                    strings[j-1] = strings[j];
                    strings[j] = tempname;
                }

            }
        }


        //--------------------------------Sorted output
        for(int i = 0; i < n ; i++)
        {
            System.out.print("Name : "+strings[i]+" Marks : "+arr[i]);
            System.out.println();
        }

    }
}
