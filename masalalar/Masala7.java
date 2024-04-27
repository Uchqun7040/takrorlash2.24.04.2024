package masalalar;

import java.util.Scanner;

public class Masala7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b = a.charAt(0);
        if (b > 64 && b < 91){
            System.out.println("Katta harf");
        }
        else if(b > 96 && b < 123)
            System.out.println("Kichik harf");
        else
            System.out.println("boshqa belgi");
    }
}
