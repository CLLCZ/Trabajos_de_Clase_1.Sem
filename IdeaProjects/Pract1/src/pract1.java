import java.util.Scanner;
public class pract1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double grados;

        System.out.println("Ingrese un angulo para saber si es un angulos recto");
        grados = leer.nextDouble();

        if (grados == 90){
            System.out.println("El angulo es un angulo recto");
        } else {
            System.out.println("El angulo no es un angulo recto");
        }
    }
}
