//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
       // LinkedHashMap hm=new LinkedHashMap();
    //    int element=-1;
        for(int i=0; i<S.length(); i++){
            
            if(hm.containsKey(S.charAt(i))){
              //  element=arr[i];  break;
                hm.put(S.charAt(i),hm.get(S.charAt(i))+1);
            }
            else hm.put(S.charAt(i), 1);
            
        }
      
        for(Map.Entry<Character,Integer>e:hm.entrySet()){
            if(e.getValue()==1){ return e.getKey();
            
            }
            }
            return '$';
    }
}

