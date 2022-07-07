import java.util.Scanner;
public class Cinco {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        System.out.println("Escolha uma palavra");
        String palavra = scan.next();
        System.out.println(reverse(palavra));
    }
    static String reverse(String original) {
        String reversed = "";
        for (int i = original.length() - 1;  0 <= i; i--) {
            reversed += original.charAt(i);
        }
        return reversed;
    }
}
