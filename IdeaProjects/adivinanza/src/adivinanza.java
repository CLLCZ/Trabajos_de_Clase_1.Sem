import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class adivinanza {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resp;
        Random g = new Random();
        String palausu;
        String[] palabras = new String[]{"Hermosillo", "Steam", "Dormir", "Camisa", "Uno"};
        String paladiv = palabras[(int) (Math.random()*5)].toLowerCase();

        do  {
            System.out.println("Juego de adivinanza");
            System.out.println("Ingrese una palabra como su intento de adivinar:");
            palausu = leer.nextLine();
            if (palausu.toLowerCase().equals(paladiv)){
                System.out.println("Ha adivinado la palabra ¡Felicidades!");
                System.out.println("Ha obtenido 10 puntos");
            } else {
                System.out.println("Esa no es la palabra");
            }
            System.out.println("¿Desea seguir? ingrese 1 si si, 0 si no");
            resp = leer.nextInt();
            if (resp == 0){
                System.out.println("Terminando juego");
                System.out.println("La palabra era:");
                System.out.println(paladiv);
            }
        } while(resp == 1);
    }
}
