    import java.util.Scanner;
    import java.text.SimpleDateFormat;
    import java.time.LocalDate;
    import java.time.LocalTime;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.Date;
    import java.time.temporal.ChronoUnit;
    public class vuelos{
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            double precioP=5800, precioT=5000;
            int nasiento, clase;

            String[] asiento = new String[30];
            asiento[0] = "Desocupado";
            asiento[1] = "Desocupado";
            asiento[2] = "Desocupado";
            asiento[3] = "Desocupado";
            asiento[4] = "Desocupado";
            asiento[5] = "Desocupado";
            asiento[6] = "Desocupado";
            asiento[7] = "Desocupado";
            asiento[8] = "Desocupado";
            asiento[9] = "Desocupado";
            asiento[10] = "Desocupado";
            asiento[11] = "Desocupado";
            asiento[12] = "Desocupado";
            asiento[13] = "Desocupado";
            asiento[14] = "Desocupado";
            asiento[15] = "Desocupado";
            asiento[16] = "Desocupado";
            asiento[17] = "Desocupado";
            asiento[18] = "Desocupado";
            asiento[19] = "Desocupado";
            asiento[20] = "Desocupado";
            asiento[21] = "Desocupado";
            asiento[22] = "Desocupado";
            asiento[23] = "Desocupado";
            asiento[24] = "Desocupado";
            asiento[25] = "Desocupado";
            asiento[26] = "Desocupado";
            asiento[27] = "Desocupado";
            asiento[28] = "Desocupado";
            asiento[29] = "Desocupado";
            LocalDateTime fecha1 = LocalDateTime.of(2025, 10, 4, 18, 30);
            LocalDateTime fecha2 = LocalDateTime.of(2025, 10, 4, 18, 0);

            long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
            long horas = ChronoUnit.HOURS.between(fecha1, fecha2);
            long minutes = ChronoUnit.MINUTES.between(fecha1, fecha2);

            LocalDate myObj = LocalDate.now();
            LocalTime tiempo = LocalTime.now();
            LocalDateTime FechaTiempo = LocalDateTime.now();

            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

            String formattedDate = FechaTiempo.format(dateFormat);
            System.out.println("Tiempo actual: " + formattedDate);
            String desea;
            do {
                System.out.println("Reservas del vuelo Hermosillo - CDMX");
                System.out.println("Tiempo hasta el cual se puede reservar un asiento:");
                System.out.println(fecha2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                System.out.println("Tiempo de despegue del avión:");
                System.out.println(fecha1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
                System.out.println("Número de asientos del avión: 30");
                System.out.println("1.- Clase Premier: Asientos 1 - 10");
                System.out.println("2.- Clase Turista: Asientos 11 - 30");

                System.out.println("Ingrese el número de asiento:");
                nasiento = leer.nextInt();

                if (nasiento <= 10) {
                    System.out.println("Clase Premier, 1 - 10 asientos con mayor espacio");

                    System.out.println("Precio:  " +precioP );
                    System.out.printf("Estado del asiento: " +asiento[nasiento]);
                    if (asiento[nasiento].equals("Desocupado")){
                        System.out.println("¿Desea reservar este número de asiento? (s/n)");
                        desea = leer.next();
                        if (desea.equalsIgnoreCase("s")){
                            asiento[nasiento] = "Ocupado";
                            System.out.println("Asiento reservado, proceda a pagar");
                        }
                    }
                }
                if (nasiento >= 11 & nasiento <= 30) {
                    System.out.println("Clase turista 11 - 30 ");
                    System.out.println("Precio:  " +precioT );
                    System.out.printf("Estado del asiento: " +asiento[nasiento]);
                    if (asiento[nasiento].equals("Desocupado")){
                        System.out.println("¿Desea reservar este número de asiento? (s/n)");
                        desea = leer.next();
                        if (desea.equalsIgnoreCase("s")){
                            asiento[nasiento] = "Ocupado";
                            System.out.println("Asiento reservado, proceda a pagar");
                        }
                    }
                }
                if (nasiento >30) {
                    System.out.println("Opcion no valida, vuelva a intentar");
                }

                System.out.println("Dias de diferencia = " + dias);
                System.out.println("Horas de diferencia = " + horas);
                System.out.println("Minutos de diferencia = " + minutes);
                LocalDateTime parsedFormattedDate = LocalDateTime.parse(formattedDate, dateFormat);

                if (fecha2.isBefore(parsedFormattedDate)) {
                    System.out.println("Puede reservar este asiento en este momento");
                } else if (fecha2.isAfter(parsedFormattedDate)) {
                    System.out.println("No puede reservar este asiento en este momento");
                }
                System.out.println("¿Desea reservar nuevamente? = s/n ");
                desea = leer.next();

            }while (desea.equalsIgnoreCase("s"));
        }
    }
