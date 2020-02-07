package pg10Q;
//page no 55 ka X wala question :::
import  java.util.Scanner;
public class practical {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First String ::");
        String str = in.nextLine();
        System.out.println("Enter Second String ::");
        String str1 = in.nextLine();
        int i = 1;
        while(i==1)
        {

            System.out.println("Enter your Choice :");
            System.out.println("1. If Strings are equal ::");
            System.out.println("2. Char at given Index No::");
            System.out.println("3. Compare Strings ::");
            System.out.println("4. If Strings are equal Ignoring Cases ::");
            System.out.println("5. Know Length of String ::");
            System.out.println("6. Change a char from whole String ::");
            System.out.println("7. If starts with given char ::");
            System.out.println("8. If ends with given char ::");
            System.out.println("9. Know index of given char ::");
            System.out.println("10. print Substring from given Index ::");
            System.out.println("11. Find Last Index of given char ::");
            System.out.println("12. Exit::");
            int a = in.nextInt();

            switch (a) {
                case 1:
                    if (str.equals(str1))
                        System.out.println("Both strings are equal::");
                    else
                        System.out.println("Both Strings are Not equal ::");
                    break;
                case 2:
                    System.out.println("Enter the String No to find Index of :::");
                    int I = in.nextInt();
                    System.out.println("Enter index no ::");
                    int I1 = in.nextInt();
                    if (I == 1)
                        System.out.println("Char is::" + str.charAt(I1));
                    else if (I == 2)
                        System.out.println("char is " + str1.charAt(I1));
                    else
                        System.out.println("Invalid Input");
                    break;
                case 3:
                    int A = str.compareTo(str1);
                    System.out.println("Comparison of str1 and str2 ::" + A);
                    break;
                case 4:
                    if (str.equalsIgnoreCase(str1))
                        System.out.println("Both strings are equal Ignoring cases ::");
                    else
                        System.out.println("Both Strings are unequal Including cases ::");
                    break;
                case 5:
                    System.out.println("Enter String No to find length of ::");
                    int A1 = in.nextInt();
                    if (A1 == 1) {
                        int length = str.length();
                        System.out.println("Length of String is ::" + length);
                    } else if (A1 == 2) {
                        int length = str1.length();
                        System.out.println("Length of String is ::" + length);
                    } else
                        System.out.println("invalid input::");
                    break;
                case 6:
                    System.out.println("Enter String No to replace char ::");
                    int B = in.nextInt();
                    System.out.println("Enter Char to replace :::");
                    char B1 = in.next().charAt(0);
                    System.out.println("Enter Char to replace with :::");
                    char B2 = in.next().charAt(0);
                    if (B == 1) {
                        String B3 = str.replace(B1, B2);
                        System.out.println(B3);
                    } else if (B == 2) {
                        String B3 = str1.replace(B1, B2);
                        System.out.println(B3);
                    } else
                        System.out.println("Invalid input:::");
                    break;
                case 7:
                    System.out.println("Enter String No to check start with ::");
                    int C = in.nextInt();
                    System.out.println("Enter String to be checked for Starting :::");
                    String C1 = in.nextLine();
                    if (C == 1)
                        System.out.println(str.startsWith(C1));
                    else if (C == 2)
                        System.out.println(str1.startsWith(C1));
                    else
                        System.out.println("Invalid input ");
                    break;
                case 8:
                    System.out.println("Enter String No to check end with ::");
                    int D = in.nextInt();
                    System.out.println("Enter String to be checked for End ::");
                    String D1 = in.nextLine();
                    if (D == 1)
                        System.out.println(str.endsWith(D1));
                    else if (D == 2)
                        System.out.println(str1.endsWith(D1));
                    else
                        System.out.println("Invalid Input::");
                    break;
                case 9:
                    System.out.println("Enter String No to check Char Index ::");
                    int E = in.nextInt();
                    System.out.println("Enter char to find its index :::");
                    char E1 = in.next().charAt(0);
                    if (E == 1)
                        System.out.println("Index is ::" + str.indexOf(E1));
                    else if (E == 2)
                        System.out.println("Index is ::" + str1.indexOf(E1));
                    else
                        System.out.println("Invalid Input::");
                    break;
                case 10:
                    System.out.println("Enter String No to find Substring Of ::");
                    int F = in.nextInt();
                    System.out.println("Enter Index No from which Substring starts ::");
                    int F1 = in.nextInt();
                    if (F == 1)
                        System.out.println(str.substring(F1));
                    else if (F == 2)
                        System.out.println(str1.substring(F1));
                    else
                        System.out.println("Invalid Input::");
                    break;
                case 11:
                    System.out.println("Enter String no to find last Index of given char::");
                    int G = in.nextInt();
                    System.out.println("Enter char to find last index of ::");
                    char G1 = in.next().charAt(0);
                    if (G == 1)
                        System.out.println("Last index of " + G1 + " is " + str.lastIndexOf(G1));
                    else if (G == 2)
                        System.out.println("Last index of " + G1 + " is " + str1.lastIndexOf(G1));
                    break;
                default:
                    break;
            }
            if (a==12)
                break;
            }

        }
    }

