Algoritmo ArreglosParalelos
    Dimension nombres[3];
    Dimension edades[3];
    Definir i Como Entero;
	
    // Alumno 1
    nombres[1] = "Ana";
    edades[1] = 20;
	
    // Alumno 2
    nombres[2] = "Luis";
    edades[2] = 22;
	
    // Alumno 3
    nombres[3] = "Marta";
    edades[3] = 21;
	
    Escribir "Lista de Alumnos:";
    Para i Desde 1 Hasta 3 Con Paso 1 Hacer
        Escribir "Alumno ", i, ": Nombre: ", nombres[i], ", Edad: ", edades[i];
    FinPara
	
FinAlgoritmo
