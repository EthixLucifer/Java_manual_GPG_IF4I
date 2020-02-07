package pg10Q;
//page no 73 ka 2nd wala question::
public class CHARACTER {
    public static void main(String[] args) {
        char c[] = {'b','v','7','#','D',' '};
        for (int k=0;k<c.length;++k)
        {
            if (Character.isDigit(c[k]));
            System.out.println(c[k]+" is a digit ::");
            if(Character.isLetter(c[k]))
                System.out.println(c[k]+" is a letter :");
            if(Character.isWhitespace(c[k]))
                System.out.println(c[k]+" is a whitespace ::");
            if(Character.isUpperCase(c[k]))
                System.out.println(c[k]+" is in Uppercase ::");
            if (Character.isLowerCase(c[k]))
                System.out.println(c[k]+" is in Lowercase");
        }
    }
}
