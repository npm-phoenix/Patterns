import java.util.*;


public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }
    
    public static void main(String[] arg){
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the valur of n:");
        int n = myObj.nextInt();
        nTriangle(n);
        myObj.close();
    }
}
