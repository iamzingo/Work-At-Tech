import java.util.*;
import java.lang.*;
import java.io.*;

// Please make sure not to delete the WorkAtTech class
// You can create additional non-public classes as well
// But the main method should be in the WorkAtTech class


class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        double[] input = new double[10];

        for(int i=0;i<10;i++){
            try{
                input[i] = sc.nextDouble();
            }
            catch(Exception q){
                System.out.println("Inavlid, enter properly");
                sc.nextLine();
                i--;
            }
        }

        double avg = (input[0] + input[1] + input[2] + input[3] + input[4] + input[5] + input[6] + input[7] + input[8] + input[9])/10;

        String format = String.format("%.6f",avg);
        System.out.println(format);

        sc.close();
	}
}
