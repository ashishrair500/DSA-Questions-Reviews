//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        String s3=s1+s1;
     
if(s1.length()!=s2.length()) return false;;

if(s3.indexOf(s2)==-1) return false;

return true;
     
     
     
     /*   int count=0;  //count should we equal to s1.size()
           int c1=0; 
           int j=0;
        for(int i=0; i<s3.length(); i++){
        
            if(s1.charAt(j)==s3.charAt(i)){
                j++;
                count++;
                    if(c1<count){
                
                c1=count;
            }
                //c1=count;
            }else {count =0; j=0;
            
            }
            
        
        }
        
        if(c1==s1.length()) return true;
        
        return false;
        // Your code here*/
    }
    
}