package pg10Q;
// page no 18 ka 4 th question ::
public class operator {
    public static void main(String[] args) {
        int a = 99;
        int b= 100 ;
        int num  = a == 99?99:0;
        int mun = b == 100?100:0;

        if((num==99) && (mun==100)) {
            System.out.println("The value of A is ::"+a);
            System.out.println("The value of B is ::"+b);
        }
        else
            System.out.println("Condition Did not Satisfy::");
    }
}
