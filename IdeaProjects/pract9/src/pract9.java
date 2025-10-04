import java.util.Scanner;
public class pract9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean prim;

        System.out.println("Numeros primos entre el 2 y el 1000");

        for (int i=2; i <= 1000; i++){
            prim = true;
            for (int j =( i - 1); j > 1; j--){
                if (i % j == 0){
                    prim = false;
                }
            }
            if (prim) {
                System.out.println(i + "  ");
            }
        }
    }
}
