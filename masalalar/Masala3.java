package masalalar;

import java.util.Scanner;

public class Masala3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("a") || a.equals("o") || a.equals("u") || a.equals("i") || a.equals("e")){
            System.out.println("Unli");
        }
        else
            System.out.println("Undosh");
    }
}
