import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] input = new int[num];

        for(int i=0 ; i<num ; i++){
            input[i] = sc.nextInt();
                if(num>0){
                    int m = 10;
                        for(int j=1 ; j<=m ; j++){
                        int mul = input[i] * j;
                        System.out.print(mul + " ");
                    }
					System.out.println();
            }
        }
        sc.close();
	}
}
