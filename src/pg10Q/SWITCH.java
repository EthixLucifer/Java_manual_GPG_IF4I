package pg10Q;
//page no 20 ke 2 wala question ::
public class SWITCH {
    public static void main(String[] args) {
        char b= 'A';
        switch(b)
        {
            case 'A':
                System.out.println("A <-- is Entered in Uppercase ");
                break;
            case 'a':
                System.out.println("a <--- is Entered in lowercase ::");
                break;
            default:
                    System.out.println("A/a is not given as input ::");
        }
    }
}
