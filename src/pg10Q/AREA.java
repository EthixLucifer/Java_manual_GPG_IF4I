package pg10Q;
//page no 94 ka 2 nd wla question :::
interface Circle1
{
    void area();
    final float pi = 3.14f;
    int r = 2;
    }
    interface Rectangle
    {
        void Area();
        int l = 5;
        int b = 10;
    }

public class AREA implements Circle1,Rectangle{
  public void area()
    {
        System.out.println("Area of Circle ::"+(pi*r*r));
    }
    public void Area()
    {
        System.out.println("Area of Rectangle ::"+(l*b));
    }

    public static void main(String[] args) {
        AREA A = new AREA();
        A.area();
        A.Area();
    }

}
