import java.util.Scanner;
import java.lang.Math;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int f = (int)(Math.pow(x,n));
        System.out.println(f);
    }
}