public class exercicioTres {
    public static void main(String[] args) {
        int i = 100;
        do{
            i++;
            System.out.println(i);
        }while(i < 110);

        System.out.println();
        i = 100;
        while(i < 110){
            ++i;
            System.out.println(i);
        }
        
        System.out.println();
        for(i = 101; i <= 110; i++){
            System.out.println(i);
        }
    }
}
