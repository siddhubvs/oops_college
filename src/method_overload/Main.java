package method_overload;

import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        add sum = new add(45, 76, 81);

        sum.add(5, 15, 34);
        sum.add(55, 25);

        char[] myarray = {'l', 'e', 't', 's', 'd', 'o', 'j', 'a', 'v', 'a'};

        char[] myarray1 = new char[myarray.length];
            myarray1[0]=myarray[0];

        for (int i = 0; i < myarray.length; i=i+3) {

            myarray1[i] = myarray[i];

        }

        String myarray2 = new String(myarray1);
        System.out.println(myarray1);
    }
}















