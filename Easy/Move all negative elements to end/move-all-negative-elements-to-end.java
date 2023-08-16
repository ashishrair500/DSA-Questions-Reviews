//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
            PrintWriter ot = new  PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            ot.print(a[i]+" ");
            
            ot.println();
        }
        ot.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
       ArrayList<Integer> as= new ArrayList<>();
      
        for(int i=0; i<n; i++){
            if(arr[i]<0) as.add(arr[i]);
            
        }
        int index=0;
       
       for(int i=1; i<n; i++){
           if(arr[i]>=0 &&arr[index]<0){
               int temp=arr[i];
               arr[i]=arr[index];
               arr[index]=temp;
               index++;
           }else if(arr[index]>=0){
               index++;
           }
           
       }
       index=n-1;
        for(int i=as.size()-1; i>=0; i--){
            arr[index]=as.get(i);
            index--;
            
        }
        // Your code goes here
    }
}