//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            long k = Long.parseLong(inputLine[1]);
            long[] arr = new long[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            long[] ans = new Solution().getDigitDiff1AndLessK(arr, n, k);
            for (long ele : ans) {
                System.out.print(ele + " ");
            }
            if (ans.length == 0) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    
    long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        // code here
     
       
       
    
        // code here
           Boolean flag = false;

        int ansCount=0;

        ArrayList<Long> a = new ArrayList<>();

        for(int i =0;i<n;i++){

            if(arr[i]<k && arr[i]>9){

                long num = arr[i];

                while(num>9){

                    long diff = Math.abs((num%10) - ((num/10)%10));

                    if(diff == 1){

                        num/=10;

                        flag = true;

                    }

                    else 

                    {

                        flag = false;

                        break;

                    }

                }

                if(flag){

                    a.add(arr[i]);

                }

            }

        }

        long ans[] = new long[a.size()];

        for(int i=0;i<a.size();i++)

        ans[i] = a.get(i);

        return ans;

        
        
    }
}
