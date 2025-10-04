import java.util.Scanner;
public class TicketdeCompra {
    public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);
            String nombre = null;
            String producto = null;
            double precio = 0.0;
            int cantidad = 0;
            double pago = 0.0;
            double total = 0.0;
            double subtotal = 0.0;
            double IVA = 1.16;
            double cambio = 0.0;
            System.out.println("Escriba su nombre: ");
            nombre = leer.nextLine();
            System.out.println("Escriba el nombre del producto: ");
            producto = leer.nextLine();
            System.out.println("Escriba precio: ");
            precio = leer.nextDouble();
            System.out.println("Escriba cantidad: ");
            cantidad = leer.nextInt();
            System.out.println("Escriba cantidad a pagar: ");
            pago = leer.nextDouble();
            subtotal = precio * cantidad;
            IVA = subtotal * 0.16;
            total = subtotal + IVA;


            System.out.println(";;;;;;;;Ticket de compra;;;;;;;;");
            System.out.printf("El nombre del cliente es: ", nombre);
            System.out.printf("El productos es: " , producto);
            System.out.printf("El precio es: %.2f%n", precio);
            System.out.printf("La cantidad es: %d%n", cantidad);
            System.out.printf("Subtotal: %.2f%n", subtotal);
            System.out.printf("IVA: %.2f%n", IVA);
            System.out.printf("Total: %.2f%n", total);

            System.out.println("Escribe la cantidad a pagar: ");
            cambio = pago - total;

            System.out.printf("Cambio: %.2f%n", cambio);

    }

}
