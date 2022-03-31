public class App {
    public static void main(String[] args) {
        int i = 0;
        for(;i < 10;){
            System.out.println(i);
            ++i;
        }

        while(i <= 15){
            System.out.println(i);
            i++;
        }

        while(true){
            System.out.println("Oi");

            if(true){
                break;
            }
        }
    }
}
