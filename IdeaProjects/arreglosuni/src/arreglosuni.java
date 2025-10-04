import java.util.Scanner;
public class arreglosuni {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, nfallas, num,ndias, totalnum=0;
        String[] fallas = new String[10];
        String[] dia = new String[7];
        dia[0] = "Lunes";
        dia[1] = "Martes";
        dia[2] = "Miércoles";
        dia[3] = "Jueves";
        dia[4] = "Viernes";
        dia[5] = "Sábado";
        dia[6] = "Domingo";

        fallas[0] = "Sin fallas";
        fallas[1] = "Falla tipo 1";
        fallas[2] = "Falla tipo 2";
        fallas[3] = "Falla tipo 3";
        fallas[4] = "Falla tipo 4";
        fallas[5] = "Falla tipo 5";
        fallas[6] = "Falla tipo 6";
        fallas[7] = "Falla tipo 7";
        fallas[8] = "Falla tipo 8";
        fallas[9] = "Falla tipo 9";

        for(i = 0; i < dia.length; i++) {
            System.out.println(dia[i]);
            System.out.println("Ingrese el número de tipo de la falla de este día: ");
            nfallas = leer.nextInt();
            System.out.println(fallas[nfallas]);
            System.out.println("Ingrese la cantidad de fallas presentadas:  ");
            num = leer.nextInt();
            totalnum = totalnum+num;



        }
        for(i = 0; i < fallas.length; i++) {
            System.out.println("Reporte semanal de fallas  ");
            System.out.printf("Total de fallas ocurridas:  ");
            System.out.printf("Total fallas tipo" fallas[nfallas] ": ", totalnum);
        }
        for(i = 0; i < dia.length; i++) {
            System.out.println(dia[i]);
            System.out.println("Ingrese el número de tipo de la falla de este día: ");
            nfallas = leer.nextInt();
            System.out.println(fallas[nfallas]);
            System.out.println("Ingrese la cantidad de fallas presentadas:  ");
            num = leer.nextInt();
        }

    }
}
