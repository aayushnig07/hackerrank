package Java;

import java.util.Scanner;

public class Qus16 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len =A.length();
        for(int i=0;i<len/2;i++){
            if(A.charAt(i)!=A.charAt(len-i-1)){
                //System.out.println(A.charAt(i)+" " +A.charAt(len-i-1));
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        
    }
    
}