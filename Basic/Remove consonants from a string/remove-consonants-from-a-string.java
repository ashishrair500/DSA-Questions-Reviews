//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.removeConsonants(s));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeConsonants(String s)
    {
      /*  String a="";
        for(int i=0; i<s.length(); i++){
         if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
         {
             a+=s.charAt(i);
             
         }
        }
        if(a.length()==0){
            return "No Vowel";
        }
        
        return a;  */
        
        HashSet<Character> hs = new HashSet<>();

        hs.add('a');  hs.add('i');   hs.add('u');

        hs.add('A');  hs.add('I');   hs.add('U');

        hs.add('e');  hs.add('o');

        hs.add('E');  hs.add('O');

        StringBuilder nst = new StringBuilder();

        for(int i=0;i<s.length();i++){

            if(hs.contains(s.charAt(i))){

                nst.append(s.charAt(i));

            }

        }

        if(nst.length()==0){

            return "No Vowel";

        }

        return nst.toString();
        
    }
    
}
