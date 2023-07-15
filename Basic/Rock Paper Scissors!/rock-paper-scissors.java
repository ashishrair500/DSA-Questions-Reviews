//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.gameResult(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String gameResult(String s)
    {
       char A=s.charAt(0);
       char B=s.charAt(1);
       
      if((A=='R'&& B=='S') || (A=='S'&& B=='P') ||(A=='P'&& B=='R')){
          return "A";
      }else if(A==B)
       return "DRAW";
       else return "B";
        // your code here
    }
}

//switch (strVal1, strVal2) { case ("hello", "true"): 