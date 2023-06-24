//{ Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java




class GFG
{
    long maxSum(long arr[] ,int n)
    {
        
       int ar[] = new int[6];
      //  int n = arr.length;

        int start = 0;
        int end = n - 1;
        Arrays.sort(arr);
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i] = arr[start];
                start++;
            } else {
                a[i] = arr[end];
                end--;
            }
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {

            sum += Math.abs(a[i] - a[i + 1]);

        }

        sum += Math.abs(a[n - 1] - a[0]);
      //  System.out.println(sum);

return sum;

    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] a2 = line.trim().split("\\s+");
//            int n =Integer.parseInt(a2[0]);
//            int k =Integer.parseInt(a2[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(a1[i]);
            }
            GFG ob=new GFG();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.maxSum(arr,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends