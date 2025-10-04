Algoritmo Ejem_arreglo2
	// Declarar arreglo
	Dimension nombres[5]
	
	// Valores arreglo
	Para i=1 Hasta 5 Con Paso 1 Hacer
		Mostrar "Ingresa los nombres [",i,"]: "
		Leer nombres[i]
	FinPara
	
	// Recorrer el arreglo
	Para i=1 Hasta 5 Con Paso 1 Hacer
		Mostrar "nombres[",i,"]", nombres[i]
	FinPara
	
FinAlgoritmo
