import java.util.Scanner;
public class pract4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double angulo;

        System.out.println("Ingrese los grados del angulo a identificar:");
        angulo = leer.nextDouble();

        if (angulo == 90){
            System.out.println("El angulo ingresado es recto");
        }
        if (angulo < 90){
            System.out.println("El angulo ingresado es agudo");
        }
        if (angulo > 90){
            System.out.println("El angulo ingresado es obtuso");
        }
    }
}
