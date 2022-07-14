import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class myMain {
    public static void main(String[] args) {
        int numerador, denominador, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numerador: ");

        try
        {
            numerador = sc.nextInt();

            System.out.println("Insira o denominador: ");

            denominador = sc.nextInt();

            resultado = numerador / denominador;

            System.out.println("O resultado foi de: " + resultado);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Por favor insira um numero valido, i.e. inteiro.");
        }
        catch (ArithmeticException ar)
        {
            System.out.println("Por favor insira um numero valido, i.e. inteiro e diferente de zero para o divisor.");
        }
    }
}
