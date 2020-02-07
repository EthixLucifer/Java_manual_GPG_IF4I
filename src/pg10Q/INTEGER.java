package pg10Q;
//page no 71 ka X wla  question
public class INTEGER {
    public static void main(String[] args) {
        Integer I = new Integer(10);
        Integer I1 = new Integer(10);
        System.out.println(I);

        int s = Integer.parseInt("40");
        String S = Integer.toString(40);
        byte b = I.byteValue();
        double d = I.doubleValue();
        float f = I.floatValue();
        int i = I.intValue();
        short sh = I.shortValue();
        long l = I.longValue();

        int A = I.compareTo(10);
        int B = Integer.compare(10,5);
        boolean B1 = I.equals(I1);

        System.out.println("String value of 40 is ::"+ S);
        System.out.println("Int value of String 40  is ::"+s);
        System.out.println("Int value of 40 is ::"+i);
        System.out.println("Byte value of 40 is ::"+b);
        System.out.println("Double value of 40 is ::"+d);
        System.out.println("Float value of 40 is ::"+f);
        System.out.println("Short value of 40 is ::"+sh);
        System.out.println("long value of 40 is ::"+l);

        System.out.println("I compared with 10 is :"+A);
        System.out.println("10 compared with 5 is :"+B);
        System.out.println("I==I1 is ::"+B1);

    }
}