import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int n1 = n/2 +1;
        int n2= n/2;
        for(int i=1;i<=n1;i++){
            for(int spaces = 1;spaces<=n1-i;spaces++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int r =1;r<=i-1;r++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n2;i++){
            for(int spaces = 1;spaces<=i;spaces++){
                System.out.print(" ");
            }
            for(int j =1;j<=n2-i+1;j++){
                System.out.print("*");
            }
            for(int r =1;r<=n2-i;r++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
    }
}