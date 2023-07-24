//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();

    		System.out.println (new Sol().divisibleBy4 (s));
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int divisibleBy4 (String N)
    {
        int rem=0;
        
        for(int i=0; i<N.length(); i++){
        int p=N.charAt(i)-'0';
        rem=(rem*10+p)%4;
        
            
            
        }
        
        
        if(rem==0)  return 1;
        
        return 0;
       
      /* long num=Integer.parseInt(N)%100000007;
      
       
       if(num%4==0) return 1;
       
       return 0;
        // Your Code Here*/
    }
}