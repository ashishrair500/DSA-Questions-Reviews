//{ Driver Code Starts
import java.util.*;
class Numbers{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		GfG g=new GfG();
		System.out.println(g.num(a,n,k));
	}
}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
          public static int num(int a[], int n, int k)
            {
         //    int n = Integer.parseInt(new String(a))    ;
         //  String s= Arrays.toString(a);    
           int count=0;
           
           for(int i=0; i<a.length; i++)
           {
               String s = String.valueOf(a[i]);
               
           for(int j=0; j<s.length(); j++)
           {
               
        if(Integer.parseInt(String.valueOf(s.charAt(j))) == k){
                   
                     count++;
               }
               
            }
               }
               
               return count; //Your code here
            }
}