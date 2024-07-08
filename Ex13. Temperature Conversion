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
        int num = sc.nextInt();
        double[] input = new double[num];

        for(int i=0;i<num;i++){
            try{
                input[i] = sc.nextDouble();
            }
            catch(Exception q){
                System.out.println("Inavlid, enter properly");
                sc.nextLine();
                i--;
            }
        }
        for(int j=0 ; j<num ; j++){
            double tempr = input[j];
            double fahr = (9 * tempr / 5) + 32;
            
            String format = String.format("%.2f",fahr);
            System.out.println(format);
        }
        sc.close();
	}
}
