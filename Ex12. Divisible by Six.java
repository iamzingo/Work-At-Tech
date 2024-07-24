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

        int[] input = new int[num];
        for(int i=0 ; i< num ; i++){
            input[i] = sc.nextInt();
        }
        for(int j=0 ; j<num ; j++){
            if(input[j]%6==0){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }

        sc.close();
	}
}
