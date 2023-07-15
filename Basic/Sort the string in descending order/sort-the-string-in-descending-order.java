//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        char arr []= str.toCharArray();
        
        Arrays.sort(arr);
        
        /* for(int i=0; i<=arr.length/2; i++){
         char temp=arr[i];
         arr[i]=arr[arr.length-1];
         arr[arr.length-1]=temp;
        }*/
        
        
        StringBuilder s = new StringBuilder();
      for(int i=arr.length-1;i>=0;i--)
      {
          s.append(arr[i]);
      }
        return s.toString();
        // code here
    }
} 