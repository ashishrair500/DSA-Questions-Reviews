//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
       Stack<Character> st= new Stack<>();
         st.push(S.charAt(0));
         for(int i=1; i<S.length(); i++)
       {if(st.peek()!=S.charAt(i)){
       
       st.push(S.charAt(i));
       }}
       StringBuilder s= new StringBuilder();
       
       
       while(!st.isEmpty()){
           s.append(st.pop());
           
           
       }
       
       return s.reverse().toString();
       /*
        for(int i=1; i<S.length(); i++)
    {
        
        
        
        if(S.charAt(i)==S.charAt(i-1))
        
        {
         continue;
            
        }
        
           s+=S.charAt(i);
    }
        
        return s;    */
    }
}