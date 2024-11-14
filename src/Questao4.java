public class Questao4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            int Fatorial = 1;
            for (int j = 1; j <= i ; j ++){
                Fatorial *= j;
                System.out.println("fatorial de " + i + "e" + Fatorial);
            }
        
    }
}
