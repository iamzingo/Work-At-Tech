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
        String name = sc.next();
        int year = sc.nextInt();

        if(year != 0){
            int age = 2020 - year ;
            System.out.println("Happy Birthday " + name + "! Your current age is " + age);
        }
        
        sc.close();
	}
}
