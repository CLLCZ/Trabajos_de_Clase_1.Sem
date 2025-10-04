Algoritmo SeleccionAct
	Definir n,i,h,g,sel,ult Como Entero
	Mostrar "Ingrese el número de actividades:"
	leer n

	Dimension inicio[n]
	Dimension final[n]
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Mostrar "Ingrese la hora de inicio de la actividad ",i,":"
		leer inicio[i] 
		Mostrar "Ingrese la hora de finalizacion de la actividad ",i,""
		leer final[i] 
	FinPara

	Para i<-1 Hasta n Con Paso 1 Hacer
		Mostrar "Actividad  " ,i, "  Inicio  " ,inicio[i], "  Fin  " ,final[i], ;
	FinPara
	
	Para i<-1 Hasta n-1 Con Paso 1 Hacer
		Para h<-1 Hasta n-1 Con Paso 1 Hacer
			si final[h] > final[h+1] Entonces
				g = final[h]
				final[h] = final[h+1]
				final[h+1] = g
			FinSi
			si inicio[h] > inicio[h+1] Entonces
				g = inicio[h]
				inicio[h] = inicio[h+1]
				inicio[h+1] = g
			FinSi
		FinPara
	FinPara
	
	Para i<-1 Hasta n Con Paso 1 Hacer
		Mostrar "Actividad  " ,i, "  Inicio  " ,inicio[i], "  Fin  " ,final[i], ""
	FinPara
	
	ult <- -1
	sel <- 0
	Mostrar "Conjunto de actividades elegidas:"
	Para i<-1 Hasta n Con Paso 1 Hacer
		Si inicio[i] >= ult Entonces
			Mostrar " Actividad ", i, " Inicio: ", inicio[i], ", Fin: ", final[i], ""
			ult <- final[i]
			sel <- sel + 1
		FinSi
	FinPara
	
	Mostrar "Total de actividades elegidas: ", sel

	

	
	
FinAlgoritmo
