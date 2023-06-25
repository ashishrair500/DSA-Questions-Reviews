//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        
        HashMap<Character, Integer> map = new HashMap<>();
        //to get value of specific key use map.get(key); 
        
        for(int i=0; i<S.length(); i++){
            
            if(map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
                
            }else{
                
                map.put(S.charAt(i),1);
            }
            
            
        }
        
        int count=0;
       // for(int i=0; i<S.length(); i++){
           
                          
            
            for (Map.Entry<Character,Integer> entry : map.entrySet()) {
         //   System.out.println("Key = " +  +
           //", Value = " + entry.getValue());
           
           if(map.get(entry.getKey())%2!=0){
                        
                        count++;
                    } 
            
            
        }
        
        if(count<=1){
            return 1;
            
            
        }
        // your code here
        return 0;
    }
}