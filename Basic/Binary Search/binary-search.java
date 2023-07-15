//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
       int start=0;
        int end=n-1;
        int index =-1;
        
       int mid=(start+end)/2;
        while(start<=end){
          
            if(arr[mid]==k){
             index=mid;
             break;
             
            }else if(arr[mid]<k)
            {
            start=mid+1;
                
            
             }else{
            end=mid-1; 
            }
          
            
            mid=(start+end)/2;
        }
        
        return index;
        
        
        
       /*  int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
          index=mid;
     //   System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
    
 
    return index;*/
    }
}