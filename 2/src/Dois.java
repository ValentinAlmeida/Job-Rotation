import java.util.Scanner;
public class Dois {
    
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Escolha um valor");
    int valor = scan.nextInt();
    boolean certo = false;

    for (int i = 0; i <= valor; i++) {
        if (fibonacci(i) == valor){
            System.out.println("O valor pertence a sequencia de fibonacci");
            certo = true;
        }
    }

    if(certo == false){
        System.out.println("O valor não pertence a sequencia de fibonacci");
    }
}

public static long fibonacci(int n) {
    return n < 2 ? n : fibonacci(n - 2) + fibonacci(n - 1);
}
}
