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
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
       
     //  HashSet() hs = new HashSet<>();
     /*  
       1) Initialize both first and second smallest as INT_MAX
   first = second = INT_MAX
       2) Loop through all the elements.
   a) If the current element is smaller than first, then update first 
       and second. 
   b) Else if the current element is smaller than second then update 
    second
    */
       
        long [] arr = {-1,-1};
     int firsts=0;
       long seconds=Integer.MAX_VALUE;
       
        if(n==1){
           arr[0]=-1;
           arr[1]=-1;
        }
        
        for(int i=0; i<a.length; i++){
            if(a[i]<a[firsts]){
             //  seconds=firsts; 
                firsts=i;
            }
        }
        
        arr[0]=a[firsts];
       // arr[1]=a[seconds];
      /*   
      if(firsts==seconds){
            seconds=1;
        }
       
          arr[0]=a[firsts];
        */
        
        for(int i=0; i<a.length; i++){
         
         

        if(a[i] < seconds && a[i] != a[firsts]){
            
            seconds=a[i];
            
        
        }
        }
        arr[1]=seconds;
        
        
        
        
         if(arr[1] == Integer.MAX_VALUE){
            arr[0] = -1;
            arr[1] = -1;
        }
        
        
        return arr;
        
        
        
        
        
        /*
         Arrays.sort(a);
        long arr[]=new long[2];
         if(n==1){
           arr[0]=-1;
           arr[1]=-1;
        }
        else{
        arr[0]=a[0];
        for(int i=1;i<n;i++){
            
            if(a[i]>arr[0]){
            arr[1]=a[i];
            break;
            }
            else if(a[0]==a[(int)n-1]){
                arr[0]=-1;
                arr[1]=-1;
            }
            
        }
        }
        return arr;*/
        
    }
}

   
