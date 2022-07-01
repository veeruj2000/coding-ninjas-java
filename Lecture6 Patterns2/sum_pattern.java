import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            int sum=1;
            System.out.print("1");
            for(int j=2;j<=i;j++){
                sum=sum+j;
                System.out.print("+"+j);
            }
            System.out.println("="+sum);
        }
	}
}
