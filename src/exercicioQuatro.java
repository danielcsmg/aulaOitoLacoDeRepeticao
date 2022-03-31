import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Algoritmo dos números pares de 1 a N");
        System.out.println("Digite um número:");
        int n = leitor.nextInt();
        leitor.close();
        int i = 0;
        do {
            i++;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } while (i < n);

        System.out.println();
        i = 1;
        while (i < n) {
            ++i;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
