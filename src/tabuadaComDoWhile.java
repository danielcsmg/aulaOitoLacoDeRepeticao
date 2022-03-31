import java.util.Scanner;

public class tabuadaComDoWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Algoritmo da TABUADA");

        System.out.println("Digite um número:");
        int tabuada = leitor.nextInt();
        leitor.close();
        int resultadoTabuada;
        int i = 0;

        do{
            resultadoTabuada = tabuada * i;

            System.out.println(tabuada + "x" + i + "=" + resultadoTabuada);
            i++;
        }while(i <= 10);
    }
}
