package dataStructures;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution_done {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jump=0, i=0;
       while(i<c.length)
       {
    	   i=i+2;
    	   boolean breakflag=false;
    	  if(i>=c.length)
    	  {
    		  if(i==c.length)
    		  {
    			i=i-1; 
    		  }
    		  else
    		  {
    		i=i-2;
    		break;
    		  }
    	  }
    	  else if(c[i]==1)
    	  {
    		  i=i-1;
    	  }
    	  if(c[i]==0)
    	  {
    		  jump++;
    	  }
    	  if(breakflag)
    		  break;
       }
    
    return jump;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

       System.out.println(result);

        scanner.close();
    }
}