import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        for(int i=1;i<=n;i++){
            for(int spaces = 1;spaces<=n-i;spaces++){
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

		
	}

}