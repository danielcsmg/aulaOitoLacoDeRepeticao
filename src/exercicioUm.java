public class exercicioUm {
    public static void main(String[] args) {
        System.out.println("Primeira forma de apresentar os números pares de um a cem.");
        
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Segunda forma de apresentar os números pares de um a cem.");
        
        for(int i = 0; i <= 100; i=i+2){
            System.out.println(i);
        }
    }
}
