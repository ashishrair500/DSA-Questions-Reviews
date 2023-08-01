//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
                long sum1=0;
                long sum2=0;
                
                long a[]=new  long[n];
                long ar[]=new long[n];
               
                int j=n-1;
               
                for(int i=0; i<n; i++){
                sum1+=arr[i];
                sum2+=arr[j];
                a[i]=sum1;
                ar[j]=sum2;
                j--;        
                }
                
                int ans=-1;
                int count=n-1;
                for(int i=0; i<n; i++){
                   if(Math.abs(a[i]-ar[i])==0) ans=i;
                }
                
                return ans>=0?ans+1:ans;
        // Your code here
    }
}
