import java.util.Scanner;
public class pract7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a,b,c,d,e,f,resx, resy;

        System.out.println("Ingrese el valor de a=");
        a = leer.nextDouble();
        System.out.println("Ingrese el valor de b=");
        b = leer.nextDouble();
        System.out.println("Ingrese el valor de c=");
        c = leer.nextDouble();
        System.out.println("Ingrese el valor de d=");
        d = leer.nextDouble();
        System.out.println("Ingrese el valor de e=");
        e = leer.nextDouble();
        System.out.println("Ingrese el valor de f=");
        f = leer.nextDouble();

        System.out.println("Sistema de ecuaciones lineales: ax + by = c");
        System.out.println("                                dx + ey = f");

        System.out.println("Formula x = ce - bf / ae - bd");
        System.out.println("Formula y = af - cd / ae - bd");

        if (((a*e) - (b*d)) > 0 ) {
            resx = ((c * e) - (b * f)) / ((a * e) - (b * d));
            resy = ((a * f) - (c * d)) / ((a * e) - (b * d));
            System.out.printf("Resultado de X= %.2f%n", resx);
            System.out.printf("Resultado de Y= %.2f%n", resy);
        } else if (((a*e) - (b*d)) < 0 ) {
            resx = ((c*e) - (b*f)) / ((a*e) - (b*d));
            resy = ((a*f) - (c*d)) / ((a*e) - (b*d));
            System.out.printf("Resultado de X= %.2f%n", resx);
            System.out.printf("Resultado de Y= %.2f%n", resy);

        } else {
            System.out.println("No tiene solución");
        }

    }
}
