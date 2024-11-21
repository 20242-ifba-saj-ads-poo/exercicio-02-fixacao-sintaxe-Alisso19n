public class Questao7   {
    
    public static void main(String[] args) {
        
       int x = 13;
       System.out.println("sequencia para x ="+ x + ": ");
       imprimirSequencia(x);
    }
       
    

    public static void imprimirSequencia(int x) {
        if (x == 1){
            System.out.println(x);
            return;
        }
        System.out.print(x + " -> ");
        
        imprimirSequencia( x % 2 == 0 ? x / 2 : 3 * x + 1);
    }

    
    


}
