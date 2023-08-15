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
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        Set<Character> hs=new LinkedHashSet<>();
        for(int i=0; i<S.length(); i++){
            hs.add(S.charAt(i));
        }
        
        Iterator it=hs.iterator();
        S="";
        while(it.hasNext()){
            S+=it.next();
            
        }
        
        return S;
    }
}