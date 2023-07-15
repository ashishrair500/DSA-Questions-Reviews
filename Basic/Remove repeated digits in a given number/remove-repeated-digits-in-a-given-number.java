//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long num = Long.parseLong(read.readLine()); 
            Solution ob = new Solution();
            System.out.println(ob.modify(num));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long modify(long N)
    {
        //code here
        char[] chars=String.valueOf(N).toCharArray();
    String s="";
        for(int i=0; i<chars.length-1; i++){
            if(chars[i]!=chars[i+1]){
                s+=chars[i];
                
            }
            
            
        }
        s+=chars[chars.length-1];
        
        return Long.parseLong(s);
    }
}