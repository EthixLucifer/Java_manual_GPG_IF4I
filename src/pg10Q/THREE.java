package pg10Q;
//page no 85 ka 1st wala queestion ::

class ONE
{
    int a = 5;
    int b = 6;
    }

    class TWO extends ONE
    {
        void show()
        {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }

public class THREE extends TWO {
    public static void main(String[] args) {
        THREE AO1 = new THREE();
        AO1.show();
    }
}
