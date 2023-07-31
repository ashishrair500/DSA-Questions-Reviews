//{ Driver Code Starts
import java.util.*;
class Index{
public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.findEquilibrium(a,n));
		}
}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                int sum1=0;
                int sum2=0;
                
                int a[]=new int[n];
                int ar[]=new int[n];
               
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
                
                return ans;
                //add code here.
              }
}