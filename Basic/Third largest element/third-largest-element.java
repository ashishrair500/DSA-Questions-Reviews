//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int arr[], int n)
    {
        if(n<3){
            return -1;
        }
        
        /*
    HashSet<Integer> hs = new HashSet<>();   */
    int Firstmax=0;
    int Secondmax=0;
    int Thirdmax=0;
    
    for(int i=0; i<n; i++){
        if(arr[i]>arr[Firstmax]){
            Firstmax=i;
            
            
        }
        
        
    }
    if(Secondmax==Firstmax){
Secondmax=1;
    }
    
    for(int i=0; i<n; i++){
        if(i!=Firstmax){
            
            if(arr[i] > arr[Secondmax])
            {
                Secondmax=i;
            }
            
        }
        
    }
    
    
    for(int i=0; i<n; i++){
        if(i!=Firstmax && i!= Secondmax){
            
                    if(arr[i]>Thirdmax){
                        Thirdmax=arr[i];
                    }
            
        }
        
    }
    
     /*       int arr[]=new int[hs.size()];

    for(int i=0; i<hs.size(); i++){
    arr[i]=hs.get(i);
    }
	 return arr[arr.length-4];
	 
	 
	*/    // Your code here
	
	return Thirdmax;
    }
}
