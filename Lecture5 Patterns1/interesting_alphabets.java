import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            int row= 'A'+n-i;
            for(int j=1;j<=i;j++){
                System.out.print((char)(row+j-1));
            }
            System.out.println();
        }
	}
}