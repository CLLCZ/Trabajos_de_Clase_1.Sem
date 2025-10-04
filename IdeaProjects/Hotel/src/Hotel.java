import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double dias, precio, total, subtotal, descuento=0 ;
        byte desea;

        do {
            System.out.println("Ingrese el numero de dias de hospedaje: ");
            dias = leer.nextDouble();
            System.out.println("Ingrese el precio por habitacion: ");
            precio = leer.nextDouble();
            subtotal = precio * dias;

            if (dias >= 5){
                descuento = subtotal * 0.10;
                System.out.println("Tendrá un descuento del 10% ");
            }
            if (dias >= 10){
                descuento = subtotal * 0.15;
                System.out.println("Tendrá un descuento del 15% ");
            }
            if (dias >= 15){
                descuento = subtotal * 0.20;
                System.out.println("Tendrá un descuento del 20% ");
            }
            total = subtotal - descuento;
            System.out.printf("Precio del hospedaje: %.2f%n", subtotal);
            System.out.printf("Descuento aplicable: %.2f%n", descuento);
            System.out.printf("Total a pagar: %.2f%n", total);
            System.out.println("¿Desea calcular nuevamente? = s/n ");
            desea = leer.nextByte();

        }while (desea == 's');

    }
}


