import java.sql.SQLOutput;
import java.util.Scanner;
public class pedido {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String descripcion;
        int cantidad;
        double precio, costo, descuento, total;
        System.out.println("Escribe la descripcion: ");
        descripcion = leer.nextLine();
        System.out.println("Escribe precio unitario: ");
        precio = leer.nextInt();
        System.out.println("Escriba cantidad a pedir: ");
        cantidad = leer.nextInt();
        costo = precio * cantidad;

        if (cantidad > 50) {
            descuento = costo * 0.15;
            total = costo * descuento;
            System.out.println("El descuento es: " + descuento);
            System.out.println("El total es: " + total);
        } else {
            System.out.println("El total es: " + costo);
        }
    }
}
