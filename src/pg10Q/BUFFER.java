package pg10Q;
//page no 57 ka 2nd program::
public class BUFFER {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");

        sb.insert(11," 2019");

        sb.setLength(16);

        sb.setCharAt(15,'1');

        sb.reverse();


    }
}
