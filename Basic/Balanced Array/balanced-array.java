//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long minValueToBalance(long arr[] ,int n)
    {
int start = 0;
int end = n-1;

int mid =(start+end)/2;


int sum1=0;
int sum2=0;

for (int i=0; i<=mid; i++){
    sum1+=arr[i];
}

for (int i=mid+1; i<n; i++){
    sum2+=arr[i];
}

int num=0;
if(sum1>sum2){
    num = sum1-sum2;
}else{
    
    num = sum2-sum1;
    
}
return num;
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

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends