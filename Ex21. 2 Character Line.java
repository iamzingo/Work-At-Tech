import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String word = "WORKATTECH";
         char[] arr = word.toCharArray();

        for(int i=0; i<word.length() ; i+=2){
            if(i+1< arr.length){
                System.out.println(arr[i]+""+arr[i+1]);
            }
            else{
                System.out.println(arr[i]);
            }
        }
	}
}
