import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;

        try
        {
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();

            while (array[i] != 0)
            {
                array[++i] = sc.nextInt();
            }

            for (int j = 0; j < array.length; j++) {
                System.out.println("Seus numeros são: "+array[j]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Por favor insira apenas 10 numeros");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Por favor insira apenas numeros");
        }
    }
}