// Right angle triangle throgh *s
import java.util.*;

public class RightTriangle{
  public static void RightAngleTriangleForest(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
        System.out.print("* ");        
      }
      System.out.println("");
    }
  }
  
  
  public static void main(String[] args){
      Scanner myObj =  new Scanner(System.in);
      System.out.println("Enter the value of n");
      int n = myObj.nextInt();
      RightAngleTriangleForest(n);
      myObj.close();
  }
}
