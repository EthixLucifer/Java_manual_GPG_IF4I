package pg10Q;
//page no 94 ka 1 st question :: Error corrected hai ::
interface Circle
{
    void getRadius();
    int radius = 10;
}
class NewCircle implements Circle
{
    public void getRadius()
    {
        System.out.println(radius);
    }
}
public class ExtendInterface extends NewCircle{
    public static void main(String[] args) {
        Circle nc = new NewCircle();
        nc.getRadius();
    }

}
