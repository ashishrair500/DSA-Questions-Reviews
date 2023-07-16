//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.isSame(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
       /* 
        int len=s.length()-1;
       
        
        String str="";
        int dcount=0;
        for(int i=0; i<=len; i++){
            if(Character.isDigit(s.charAt(i))) dcount ++;
        
        }
        
        
        for(int i=len-dcount+1; i<=len; i++){
            str+=s.charAt(i);
            
        }
      long n=len+1-dcount;
      long num = Long.parseLong(str);
      // BigInteger result = new BigInteger(str) ;
        if(n==num) return 1;
        
        return 0;
        
        
        
        */
        
        
        
                int len = 0;
        int num = 0;
        
        for(int i = 0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                len++;
            }
            
            if(Character.isDigit(s.charAt(i))){
                num = (num*10) + (s.charAt(i) - '0');
            }
        }
        
        if(len == num)
            return 1;
        return 0;
        
    

    }
}