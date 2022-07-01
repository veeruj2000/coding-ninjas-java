import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("*");
        for(int i = 1; i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int m=1;m<=i-1;m++){
                int row=i-1;
                System.out.print(row-m+1);
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            System.out.print("*");
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for(int m=1;m<=n-i-1;m++){
                int row=n-i-1;   //3
                System.out.print(row-m+1);   //
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.println("*");
    }
}