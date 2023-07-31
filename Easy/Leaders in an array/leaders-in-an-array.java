//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    //calling leaders() function
		    res = obj.leaders(arr, n);
		    

		    for(int i=0; i<res.size(); i++){
		        ot.print(res.get(i)+" ");
		    }
		    
		    ot.println();
		}
		ot.close();
		
	}
}

// } Driver Code Ends


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> as= new ArrayList<>(); 
        // Your code here
    //    int max=arr[0];
    //    int count=0;
      /*  while(count!=n-1){
            
           max=0;
        for(int i=count; i<n; i++){
            if(max<arr[i]) max=arr[i];
            count=i+1;
            
        }
        as.add(max);
        }*/
        
        int max=Integer.MIN_VALUE;
       // as.add(arr[n-1]);
          for(int i=n-1; i>=0; i--){
              
              if(max<=arr[i]){
                  
               max=arr[i];  as.add(max);
                  
              }
              
          }
        
        Collections.reverse(as);
        
        return as;
    }
}
