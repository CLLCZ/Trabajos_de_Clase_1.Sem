import java.util.Scanner;
public class pract10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N=0;

        System.out.println("Especifique la cantidad de asteriscos en la parte deperior de la piramide invertida:");
        N = leer.nextInt();

        for (int i = N; i>= 1; --i) {
            for (int a = 1; a <= N - i; ++a) {
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i -1; ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < i-1; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
