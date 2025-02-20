import java.util.*;


public class Solution {
    public static void nTriangle122333(int n) {
        // Write your code here

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
           }
           System.out.println("");
        }        
    }
    
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = myObj.nextInt();
        
            nTriangle122333(n);
        
        myObj.close();
    }
}
