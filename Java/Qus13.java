package Java;

import java.util.Scanner;

public class Qus13 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB = B.length();
        System.out.println(lenA+lenB);
        String equality = (A.compareTo(B)>0)?"Yes":"No";
        System.out.println(equality);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }
    
}