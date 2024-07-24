import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] input = new int[num][3];
        for(int i=0; i<num ; i++){
            for(int j=0 ; j<3 ; j++){
                input[i][j] = sc.nextInt();
            }
        }
            for(int i=0; i<num ; i++){
                int L1 = input[i][0];
                int L2 = input[i][1];
                int L3 = input[i][2];

                    if(L1+L2>L3 && L2+L3>L1 && L1+L3>L2){
                        int circum = L1+L2+L3;
                        System.out.println(circum);
                    }
                    else
                        System.out.println("-1");
            }
        sc.close();
	}
}



//this code is correct but it shows error on compiling. I couldn't find the flaw.
