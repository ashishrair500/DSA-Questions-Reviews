//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        // Your code here
        char [] chars = String.valueOf(num).toCharArray();
     //   String.valueOf(1234).toCharArray()
        for(int i=0; i<chars.length; i++){
            if(chars[i]=='0'){
                chars[i]='5';
                
            }
            
            
        }
        int number = Integer.parseInt(new String(chars));
    /*    
        do{
        int number = num%10;
        if(number==0){
            
            
        }
        
        
        }while(number>0)   */
        return number;
    }
}