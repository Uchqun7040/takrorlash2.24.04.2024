package masalalar;

import java.util.Scanner;

public class Masala10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b &&b==c){
            System.out.println("Barcha sonlar teng");
        } else if (a>=b&&a>=c) {
            System.out.println(a);
        } else if (b>=c&&b>=a) {
            System.out.println(b);
        }else
            System.out.println(c);
    }
}
