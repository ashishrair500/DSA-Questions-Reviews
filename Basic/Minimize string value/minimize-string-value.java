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
            String s = input[0];
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.minValue(s,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int minValue(String S,int K) {
        // code here
        
    HashMap<Character, Integer> hm = new HashMap<>();
    
    for(int i=0; i<S.length(); i++){
        
    if(hm.containsKey(S.charAt(i)))   hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
    else hm.put(S.charAt(i),1);
        
    }
   /* 
    HashSet<Integer> hs = new HashSet<>();
    
     for(int i=0; i<S.length(); i++){
        hs.add(S.charAt(i));        
        
        
    }
    */
    
    int ans=0;
    
    int freq []=new int[26];
  int l=0;
    for(Map.Entry<Character,Integer>e:hm.entrySet())
    {
    freq[l++]=e.getValue();
        
        
    }
    
    
     for(int i = 0;i<K;i++){
            int p = 0;
            for(int j = 0;j<26;j++){
                p = (freq[j] > freq[p]) ? j : p;
            }
            freq[p]--;
        }
        
          
        for(int i = 0;i<26;i++){
            if(freq[i]>0){
                ans += (int)Math.pow(freq[i], 2);
            }
        }
    
    //find value of string

    
    
    return ans;
        
    }
}