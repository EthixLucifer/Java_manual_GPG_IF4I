package pg10Q;
//page no 79 ka 3 rd question:::
class dog
{
    void move()
    {
        System.out.println("Moves on 4 legs :::");
    }
}

class animal extends dog {
    void move()
    {
        super.move();
        System.out.println("Can move and Think");
    }

    public static void main(String[] args) {
        animal obj = new animal();
        obj.move();
    }
}
