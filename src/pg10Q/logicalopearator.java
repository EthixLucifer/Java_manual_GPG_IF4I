package pg10Q;
//page no 13 ka 2nd question ::
public class logicalopearator {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        if(a>1 && b>1)
            System.out.println("both numbes are positive ::");

        if(a!=b)
            System.out.println("Both numbers are not equal ::");
        else if  (a<0 || b<0)
            System.out.println("one of the numbes is less than Zero ::");
        else
            System.out.println("Hello World");
    }
}
