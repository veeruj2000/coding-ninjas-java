import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        char input = s.next().charAt(0);
        
        if(input>='a' && input<='z'){
        System.out.println("0");
        }
        else if(input>='A' && input<='Z'){
        System.out.println("1");
        }
        else{
        System.out.println("-1");
        }
        

    }
}