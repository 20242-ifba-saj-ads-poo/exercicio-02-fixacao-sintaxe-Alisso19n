public class Questao5 {
    public static void main(String[] args) {
        long fatorial = 1;
        for (int n = 1; n <= 30; n++ ){
        fatorial *= n;
        System.out.println("fatorial de " + n + "e" + fatorial);
        }
    }
}

//isso ocorre porque o tipo de dados int em java tem limite maximo de valores que pode armazenar, por isso ocorre o erro chamado de over flow
//para corrigir utiliza o long que tem uma capacidade maior que int porem o long tambem tem seu limite de armazenamento .
//para calcular fatoriais de numeros muito grande, pode usar a classe BIG Integer que nao tem limites de armazenamento