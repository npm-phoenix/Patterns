import java.util.*;

public class NXN_Matrix_nForest{
  static void nForest(int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      int n = myObj.nextInt();
      nForest(n);
    myObj.close();
  }
}

//This code gona take input from the user and put it inside the provided method 
