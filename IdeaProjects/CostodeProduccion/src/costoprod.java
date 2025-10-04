import java.util.Scanner;
public class costoprod {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String articulo;

        int unidadesaprod;
        double total, costofijo, costomat;
        System.out.println("Describe el articulo: ");
        articulo = leer.nextLine();
        System.out.println("Cantidad de articulos: ");
        unidadesaprod = leer.nextInt();

        costofijo = 10700;
        costomat = 3.5;
        total = (unidadesaprod * costomat) + costofijo;
        System.out.printf("Total del costo de produccion: %.2f%n", total);

    }
}
