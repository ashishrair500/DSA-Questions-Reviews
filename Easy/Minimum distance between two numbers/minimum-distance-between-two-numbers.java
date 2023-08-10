//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int arr[], int n, int x, int y) {
        // code here
        
        int ans=Integer.MAX_VALUE;
        int a=-1;
        int b=-1;
        for(int i=0; i<n; i++){
            
            if(arr[i]==x) a=i;
            
            if(arr[i]==y) b=i;
            
            if(a!=-1 && b!=-1){
                ans=Math.min(ans,Math.abs(a-b));
                
            }
            
            
            
            
            
            
            
            
            /* dangerous approach don't try to understand
            
           if(arr[i]==x || arr[i]==y || arr[n-i-1]==x || arr[n-i-1]==y){
               if(arr[i]==x || arr[n-i-1]==x){
                   if(arr[n-i-1]==x){
                   a=n-i-1;
                   if( Math.abs(a-b)<ans && b>=0) ans =Math.abs(a-b);
                       
                   }
                   else{
                        a=i;
                   if( Math.abs(a-b)<ans && b>=0) ans =Math.abs(a-b);
                   }
                   
               }else if(arr[i]==y || arr[n-i-1]==y){
                   if(arr[n-i-1]==y){
                   b=n-i-1;
                      if( Math.abs(a-b)<ans && a>=0) ans =Math.abs(a-b);}
                      else {
                           b=i;
                      if( Math.abs(a-b)<ans  && a>=0) ans =Math.abs(a-b);
                      }
               }
               
               
           }
           */
           
        }
        
        
      return ans==Integer.MAX_VALUE?-1:ans;
         
         // 1 2 7 8 9 3 10 7 8 6 3 9 2
    }
}