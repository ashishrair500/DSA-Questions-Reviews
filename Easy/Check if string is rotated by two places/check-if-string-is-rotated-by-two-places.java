//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {if(str1.length()==1 && str2.length()==1 && str1.equals(str2)) return true;
    if(str1.length()==1||str2.length()==1 ) return false;
    
  //  {if(str1equals) return false;
        
        
        StringBuilder s= new StringBuilder("");
        for(int i=2; i<str1.length(); i++)
        {
            s.append(str1.charAt(i));
        }
        s.append(str1.charAt(0));
        s.append(str1.charAt(1));
        
        
        StringBuilder ss= new StringBuilder("");
         ss.append(str1.charAt(str1.length()-2));
          ss.append(str1.charAt(str1.length()-1));
         
        for(int i=0; i<str1.length()-2; i++)
        {
            ss.append(str1.charAt(i));
        }
      
        
        String st=new String(s);
        String stt=new String(ss);
        
        if(st.equals(str2) || stt.equals(str2))
        return true;
        else return false;
        // Your code here
    }
    
}