//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long arr[]= new long[n];
        long product=1;
        int zeroes=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
              
            product*=nums[i];
           
            }
            if(nums[i]==0)   zeroes++;
        
        }
        
        
           
        
        
        if(zeroes>0){
            
            for(int i=0; i<n; i++){
            
            if(nums[i]==0 && zeroes==1){
             arr[i]=product;
            }else{
             arr[i]=0;
             }
         }
        
        }else
        {
            
            
            for(int i=0; i<n; i++){
            
               arr[i]=product/nums[i];
            
            
        }
        }
        
           
        
        return arr;
	} 
} 
