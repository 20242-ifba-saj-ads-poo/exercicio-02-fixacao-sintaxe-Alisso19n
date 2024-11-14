public class Questao6 {
    public static void main(String[] args) {
        int primeiro = 0;  
        int segundo = 1;   
        
        System.out.println("Fibonacci de 1: " + primeiro);  
        System.out.println("Fibonacci de 2: " + segundo);   
        
        int fibonacci = 0;  
        
        
        int n = 3;  
        while (fibonacci <= 100) {
            fibonacci = primeiro + segundo;  
            
            if (fibonacci > 100) {
                break;  
            }
            
            System.out.println("Fibonacci de " + n + ": " + fibonacci);  
            
            primeiro = segundo;  
            segundo = fibonacci;  
            
            n++;  
        }
    }
}

    
    

