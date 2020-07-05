package Java;

import java.util.Scanner;

public class Qus7 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int first = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                first = first + (int)(Math.pow(2,j)*b);
                System.out.print(a+first+ " ");
            }
            System.out.println();
            
        }
        in.close();
    }
    
}