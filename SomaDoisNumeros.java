import java.util.Scanner;

public class SomaDoisNumeros{
    public static void main(String [] args){
        //declaração de variavel
        double primeiroValor;
        double segundoValor;
        double resultadoSoma;

        //entrada variavel
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero:");
        primeiroValor = input.nextInt();

        System.out.println("Digite o valor do segundo numero");
        segundoValor = input.nextInt();

        
        //processamento
        resultadoSoma = (primeiroValor + segundoValor);

        //saida
        System.out.println("" + resultadoSoma);
    }
}