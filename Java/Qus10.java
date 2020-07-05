package Java;

import java.util.Scanner;

public class Qus10 {
    static int B;
    static int H;
    static boolean flag = false;
    static {
        Scanner sc = new Scanner(System.in);
        B = Integer.parseInt(sc.nextLine());
        H = Integer.parseInt(sc.nextLine());
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

}