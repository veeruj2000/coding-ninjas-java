import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int even=0;
        int odd=0;
        while(N>0){
            int dummy = N%10;
            if(dummy%2==0){
                even=even+dummy;
            }
            else{
                odd=odd+dummy;
            }
            N=N/10;
        }
        System.out.println(even + " " + odd);

	}
}
