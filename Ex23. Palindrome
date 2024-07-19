import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<num ; i++){
            String input = sc.next();
            String org_input = input;
            
            String rev = "";
            int len = input.length();

            for(int j = len -1 ; j >= 0 ; j--){
                rev = rev +input.charAt(j);
            }
            
            if(org_input.equals(rev)){
                System.out.println("True");
            }
            else
                System.out.println("False");
        }
        sc.close();
	}
}
