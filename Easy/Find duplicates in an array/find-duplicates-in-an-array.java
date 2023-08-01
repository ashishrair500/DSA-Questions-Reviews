//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> as = new ArrayList<>();
       // ArrayList<Integer> a = new ArrayList<>();

       /* int count=0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]) 
            {
            
            if(as.contains(arr[i+1])==false){
            as.add(arr[i+1]);
            count++;
            }
            }
            
        }
        if(count==0)        as.add(-1);
        return as ;*/
        
        
        
                  // code here
        Arrays.sort(arr);
        ArrayList<Integer> nn = new ArrayList<Integer>();
        int ar[]=  new int [100000];
        for(int i=0;i<n;i++){
            ar[arr[i]]=ar[arr[i]] + 1;
        }
        for( int i=0;i<100000;i++){
            if(ar[i]>1){
                nn.add(i);
            }
        }
        if(nn.size()==0)
        nn.add(-1);
        return nn;
}}
