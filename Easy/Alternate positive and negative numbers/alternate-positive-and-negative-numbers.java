//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        List<Integer> ps =new ArrayList<>();
        List<Integer> ns =new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]<0) ns.add(arr[i]);
            else ps.add(arr[i]);
            
        }
        int j=0;
        int k=0;
        int index=0;
          for(int i=0; i<n; i++){
        if(i%2==0 && ps.size()>j){
            arr[i]=ps.get(j); 
            j++;
            }else if(i%2!=0 && ns.size()>k){
            arr[i]=ns.get(k); k++;
            }else{ index=i; break;}
        
          }
          
        int  psIndex=ps.size()-j;
        int  nsIndex=ns.size()-k;
          
          for(int i=0; i<psIndex; i++){
              arr[index]=ps.get(j); j++;index++;
          }
          
          for(int i=0; i<nsIndex; i++){
              arr[index]=ns.get(k); k++; index++;
          }
          
        
    }
}