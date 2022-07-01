import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print((i*2)+(2*j)-3);
            }
            for(int m=1;m<=i-1;m++){
                System.out.print(((m)*2)-1);
            }
            System.out.println();
        }
	}
}
