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
            
            String input[] = read.readLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);
            Solution ob = new Solution();
            System.out.println(ob.kthCharacter(m,n,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    char kthCharacter(int m, int n, int k) {
        // code here
     
        
        String s= Integer.toBinaryString(m);
        while(n>0){
               String str="";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1')
                str+="10";
                else str+="01";
                
                
            }
            s=str;
            n--;
        }
        return s.charAt(k-1);
        
    }
}