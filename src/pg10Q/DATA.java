package pg10Q;
//page no 85 ka 2 question::
public class DATA {
    int l = 5;
    int b = 10;
    int h = 25;
    }

    class CALCUALTION extends DATA
    {
        void area()
        {
            System.out.println("Area is :"+(l*b)+" cm.sq");
        }
        void volume()
        {
            System.out.println("Volume is :"+(l*b*h)+"  cubic meter :");
        }

        public static void main(String[] args) {
            CALCUALTION C1 = new CALCUALTION();
            C1.area();
            C1.volume();
        }
    }
