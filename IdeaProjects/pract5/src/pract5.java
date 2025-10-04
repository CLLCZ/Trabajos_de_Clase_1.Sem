import java.util.Scanner;
public class pract5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double N, metros, yardas, pulgadas, pies;

        System.out.println("Ingresa hasta cuantos metros desea conocer su conversión");
        N = leer.nextDouble();

        System.out.println("CONVERSIONES");
        System.out.println("METROS YARDAS PULGADAS PIES");

        for (int i=1; i<=N; i++){
            pulgadas = i * 2.54;
            pies = pulgadas * 12;
            yardas = pies * 3;

            System.out.println("  "+ i + "    " + yardas + "   "+ pulgadas + "   " + pies + " ");
        }
    }
}
