Algoritmo EjArregloBidi
	//Definnir arreglo bidimensional
	Dimension nombres[3,3]
	//LLenar el arreglo bidimensional
	Para f<-1 Hasta 3 Con Paso 1 Hacer
		Para c<-1 Hasta 3 Con Paso 1 Hacer
			Mostrar "Ingresa el valor del arreglo[",f,"][",c,"] = "
			Leer nombres[f,c]
		FinPara
	FinPara
	//Recorrer arreglo bidimensional
	Para f<-1 Hasta 3 Con Paso 1 Hacer
		Para c<-1 Hasta 3 Con Paso 1 Hacer
			Mostrar "Ingresa el valor del arreglo[",f,"][",c,"] = ", nombres[f,c]
		FinPara
	FinPara
	
FinAlgoritmo
