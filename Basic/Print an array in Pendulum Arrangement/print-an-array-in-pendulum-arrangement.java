//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            int answer[] = obj.pendulumArrangement(arr, n);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) output.append(answer[i] + " ");
            System.out.println(output);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Compute {
    public int[] pendulumArrangement(int arr[], int n) {
        // Write your code here
    /*    ArrayList<Integer> a= new ArrayList<>();
      //  ArrayList<Integer> o= new ArrayList<>();
        for(int i=0; i<n; i++){
              a.add(arr[i]);
        }
        Collections.sort(a);//evens number
        
        ArrayList<Integer> e= new ArrayList<>();
        ArrayList<Integer> o= new ArrayList<>();
        
         for(int i=n-1; i>=0; i--){
             if(i%2==0){
              e.add(a.get(i));
             }else{
                 o.add(a.get(i));
                 
             }
        }
        
        for(int i=0; i<e.size(); i++){
            arr[i]=e.get(i);
        }
        
        
        for(int i=e.size(); i<n; i++){
            arr[i]=o.get(i-e.size()+(n-i-1));
        }
        
        return arr;
        */
        
        
        
        ArrayList<Integer>lst1 = new ArrayList<>();
        ArrayList<Integer>lst2 = new ArrayList<>();
        ArrayList<Integer>lst3 = new ArrayList<>();
        Arrays.sort(arr);
        
        if(n%2==0)
        {
            for(int i=n-2;i>=0;i=i-2)
            {
                lst2.add(arr[i]);
            }
            for(int i=1;i<n;i=i+2)
            {
                lst1.add(arr[i]);
            }
            lst3.addAll(lst2);
            lst3.addAll(lst1);
        }
        else
        {
            for(int i=n-1;i>=0;i=i-2)
            {
                lst2.add(arr[i]);
            }
            for(int i=1;i<n;i=i+2)
            {
                lst1.add(arr[i]);
            }
            lst3.addAll(lst2);
            lst3.addAll(lst1);
        }
        int i=0;
        int brr[] = new int[n];
        for(Integer j:lst3)
        {
            brr[i] = j;
            i++;
        }
        return brr;
        
    }
}