import java.util.EventListenerProxy;
import java.util.Scanner;
public class diamesj {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double mes;
        double dia;
        double dias;
        double dian;
        String tipo;

        System.out.println("Introduzca tipo de año, si es bisiesto introduzca 's', si no 'n' ");
        tipo = leer.nextLine();
        System.out.println("Introduzca el numero del mes:");
        mes = leer.nextDouble();
        System.out.println("Introduzca el numero de dìa");
        dia = leer.nextDouble();

        switch ((int) mes) {
            case 1: System.out.println("Enero");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                    System.out.println(dia);
            } ;break;

            case 2: System.out.println("Febrero");
                switch (tipo){
                    case "s": System.out.println("Año bisiesto.");
                    if (dia > 29.00) {
                            System.out.println("Numero de dia no valido");
                    } else if (dia <= 29.00) {
                            System.out.println(dia);
                    } ;break;
                    case "n": System.out.println("Año comùn");
                    if (dia > 28.00) {
                            System.out.println("Numero de dia no valido");
                    } else if (dia <= 28.00) {
                            System.out.println(dia);
                    } ;break;
                }

            case 3: System.out.println("Marzo");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            case 4: System.out.println("Abril");
                if (dia > 30.00) {
                    System.out.println("Numero de dia no valido");
                } else if (dia <= 30.00)  {
                    System.out.println(dia);
                } ;break;

            case 5: System.out.println("Mayo");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            case 6: System.out.println("Junio");
                if (dia > 30.00) {
                    System.out.println("Numero de dia no valido");
                } else if (dia <= 30.00)  {
                    System.out.println(dia);
                } ;break;

            case 7: System.out.println("Julio");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            case 8: System.out.println("Agosto");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            case 9: System.out.println("Septiembre");
                if (dia > 30.00) {
                    System.out.println("Numero de dia no valido");
                } else if (dia <= 30.00)  {
                    System.out.println(dia);
                } ;break;

            case 10: System.out.println("Octubre");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            case 11: System.out.println("Noviembre");
                if (dia > 30.00) {
                    System.out.println("Numero de dia no valido");
                } else if (dia <= 30.00)  {
                    System.out.println(dia);
                } ;break;

            case 12: System.out.println("Diciembre");
            if (dia > 31.00) {
                System.out.println("Numero de dia no valido");
            } else if (dia <= 31.00)  {
                System.out.println(dia);
            } ;break;

            default:
                System.out.println("Nùmero de mes no valido"); break;
        }
    }
}

    //Introduzca un mes (1 para Enero, 2 para Febrero,…)
    //Introduzca un día del mes
    //El programa debe de aceptar y almacenar un número
    //en la variable mes en respuesta a la primera pregunta
    //y aceptar y almacenar un número en la variable día en
    //respuesta a la segunda pregunta. Si el mes introducido
    //no está entre 1 y 12 inclusive, se debe visualizar un
    //mensaje de información al usuario advirtiéndole de que
    //el número introducido no es válido como mes; de igual
    //forma se procede con el número que representa el día del
    //mes si no está en el rango entre 1 y 31.
    //Modifique el programa para prever que el usuario introduzca números con decimales.
    //*Nota: como los años bisiestos, febrero tiene 29 días,
    //modifique el programa de modo que advierta al usuario si introduce un día de mes
    //que no existe (por ejemplo, 30 o 31). Considere también el hecho de que hay meses de 30
    //días y otros meses de 31 días, de modo que nunca se produzca error de introducción de
    //datos o que en su defecto se visualice un mensaje al usuario advirtiéndole del error
    //cometido.//

