//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.makeEven(str));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String makeEven(String s)
    {
        /*
        if((s.charAt(s.length()-1)-'0')%2==0) return s;
        
        StringBuilder sb = new StringBuilder();
        
        int a[]= new int[s.length()];
        
        int minEven=Integer.MAX_VALUE;
     int index=0;
        for(int i=0; i<s.length(); i++){
            
            a[i]=s.charAt(i)-'0';
            
            if(a[i]%2==0 && a[i]<=minEven) { minEven=a[i];   index=i;  }
        }
        
         if(minEven!=Integer.MAX_VALUE){
        for(int i=a.length-1; i>=0; i--){
       if(minEven==a[i]){
            int temp =a[index];
            a[index]=a[a.length-1];
            a[a.length-1]= temp;
            break;
       }
        }
         }
        for(int i=0; i<a.length; i++){
         sb.append(a[i]);   
            
        }
        
      return sb.toString();
        //code here.*/
        
        
        
        //code here.
        char ch[] = s.toCharArray();
        int n = s.length();
        int evenLastIndex=n-1;
        for(int i=0;i<n;i++)
        {
            if((ch[i]-'0')%2==0)
            {
                evenLastIndex = i;
                if(ch[i]<ch[n-1])
                    break;
            }
        }
        char temp = ch[n-1];
        ch[n-1] = ch[evenLastIndex];
        ch[evenLastIndex] = temp;
        String str = String.valueOf(ch);
        return str;
    }
}