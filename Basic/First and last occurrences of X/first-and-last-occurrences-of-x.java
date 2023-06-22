//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> as= new ArrayList<>();
      //  int ar[]=new int[2];
       // arr[0]=-1;
      as.add(0,-1);
        
        
        for(int i=0; i<n; i++){
            if(arr[i]==x){
           as.set(0,i);
          // ar[0]=i;
            break;
        }
        }
        
        
        for(int i=n-1; i>=0; i--){
            if(arr[i]==x){
                as.add(1,i);
            //   ar[1]=i;
                break;
                
            }
            
            
        }
        
        
      //  for(int i=0; i<2; i++){as.add(ar[i]);}
        return as;
    }
}
  //1 per firstocc'urence 2 pr second occurence