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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
     Arrays.sort(arr);
        String s1=arr[0];
        String s2=arr[n-1];
        int i=0;
        StringBuilder prefix= new StringBuilder("");
      //  if(s1.length()>s2.length()){
       for(int j=0; j<s1.length() ; j++){
          
            if(s1.charAt(j)==s2.charAt(j))
            prefix.append(arr[0].charAt(j));
            else
            break;
        }
    /*    }
        else{
            
            
          
       for(int j=0; j<s1.length() ; j++){
          
            if(s1.charAt(i)==s2.charAt(i))
            i++;
            else
            break;
        }
            
            
        }*/
        String str= new String(prefix);
        if(str.length()!=0)
        return str;
        else
        return "-1";
    }
}