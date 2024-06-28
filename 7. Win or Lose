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
        int num1 = sc.nextInt();
        
        int[] input = new int[num1];
        
        for(int i=0 ; i<num1 ; i++){
            input[i] = sc.nextInt();    
        }

        int big = input[0];
        for(int j=1 ; j<num1; j++){
            if(input[j]>big){
                big = input[j];
            }
        }
        if(big%2==0){
            System.out.println("WON");
        }
        else{
            System.out.println("LOST");
        }
        
        sc.close();
	}
}
