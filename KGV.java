/* This Program intends to calculate the least common multiple between 1 
and an n number given by the user and show them in a table descending order.
*/
package kgv;
/**
 *
 * @author Isamar
 */
import java.util.Scanner;
public class KGV {
 // Calculates the least common multiple 
    public static int KGV(int x, int y){
        int result=0;
        for(int i = 1; i <= y; i++) {
            if(i*x % y == 0){
                result =(i*x);
                break;
                 }
    	}
        return result;
}
//Represents the results in the tabular format and descending order.
   public static void  printIntArray(int [][] array){
     
         int n=array[0].length;
     	  System.out.print("\t");
          System.out.print("*"); 
          System.out.print(" ");
          
         for(int x=n;x>=1;x--){
              System.out.print(x); 
              System.out.print(" ");
         }
         System.out.println(" ");
         System.out.print("\t");
         for(int x=n;x>=1;x--){
             System.out.print(x); 
               System.out.print(" ");
           for(int y=n;y>=1;y--){
               System.out.print(array[x-1][y-1]); 
               System.out.print(" ");
           }
            System.out.println("");
            System.out.print("\t");
         }
    }
//The program first checks for wrong inputs and if the correct input is inserted it runs properly
   public static void main(String[] args) {
     
     	 int [][] Arr;
         Scanner input = new Scanner(System.in); 
         System.out.println("Please given number starting from 1\n");
      if (!input.hasNextInt() ){
        	System.out.println("Error, please given number starting from 1\n");
            return ; 
      }
      int n=input.nextInt();
      if (n<=0){
          System.out.println("Error, please given number starting from 1\n");
            return ; 
      }
 //The Array recieves it values depending on the input number n
      Arr=new int [n][n];
     for(int x=1;x<=n;x++){
       for(int y=1;y<=n;y++){
       	 Arr[x-1][y-1]=KGV(x,y);
       }
     }
     printIntArray(Arr);
   }        
}


    

