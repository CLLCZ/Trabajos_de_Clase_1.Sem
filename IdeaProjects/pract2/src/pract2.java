import java.util.Scanner;
public class pract2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double temp;

        System.out.println("Ingrese la temperatura para saber si es mayor o menor al punto de ebullicion");
        temp = leer.nextDouble();

        if (temp >= 100){
                System.out.println("Por encima del punto de ebullicion del agua");
        } else {
                System.out.println("Por debajo al punto de ebullicion del agua");
        }
    }
}

