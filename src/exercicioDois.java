import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Algoritmo da TABUADA");

        System.out.println("Digite um número:");
        int tabuada = leitor.nextInt();
        leitor.close();
        
        for(int i = 0; i <= 10; i++){
            int resultadoTabuada = tabuada * i;

            System.out.println(tabuada + "x" + i + "=" + resultadoTabuada);
        }
    }
}
