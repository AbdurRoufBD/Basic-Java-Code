package A3_p4;
import java.util.Scanner;

public class Location {
    private int row;
    private int column;
    private double[][] arr;

    public Location(int row, int column)
    {
        this.row = row;
        this.column = column;

        arr = new double[this.row][this.column];
    }

    public void InsertLocation()
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.column; j++)
            {
                arr[i][j] = sc.nextDouble();
            }
        }
    }

    public void getLargestLocation()
    {
        double max = -99999;
        int idx = -1;
        int idy = -1;
        for(int i = 0; i < this.row; i++)
        {
            for(int j = 0; j < this.column; j++)
            {
                if(max < arr[i][j])
                {
                    max = arr[i][j];
                    idx = i;
                    idy = j;
                }
            }
        }

        System.out.println("Location of the Largest element is "+max+" at ("+idx+","+idy+")");
    }


}
