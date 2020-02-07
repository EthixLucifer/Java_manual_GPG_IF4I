package pg10Q;
//page no 51 ka 3rd question ;;
public class complex {
    int a , b;
    float a1,b1;
    public complex()
    {

    }
    public complex(int x, int y)
    {
        a = x ;
        b = y;
        int c = a+b;
        System.out.println("sum of numbers is ::" + c);
    }
    public  complex(float x , float y )
    {
        a1 = x;
        b1 = y;
        float c  = a1+b1;
        System.out.println("sum of numbers is ::" + c);
    }

    public static void main(String[] args) {
        float a2= 99.13f;
        float b2 =  14.86f;

        complex c1 = new complex(a2,b2);

    }
}
