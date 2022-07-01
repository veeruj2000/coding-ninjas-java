import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int N = s.nextInt();
        int sum=0;
        int i=2;
        while(i<=N){
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
        

	}

}