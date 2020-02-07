
package pg10Q;
import java.util.Scanner;
//page no 10  ke X question no ka practical hai
public class pg_no_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int a = in.nextInt();
        System.out.println("Processing your result :::->");
        if(a>=1)
            System.out.println("your input is positive ::");
        else if(a<=0)
            System.out.println("your input is negative ::");

        else
            System.out.println("your input is neutral ::");
    }
}
