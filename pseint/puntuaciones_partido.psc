Algoritmo puntuaciones_partido
	Definir cantpartidos Como Entero
	Definir puntos Como Entero
	Definir puntosTotales Como Entero
	Definir mejorPuntuacion, peorPuntuacion Como Entero
	
	Mostrar "Ingrese la cantidad de partidos jugados por el equipo en la temporada"
	Leer cantpartidos
	Mostrar cantpartidos
	
	Dimension puntuaciones[cantpartidos]
	
	Para cantpartidos=1 Hasta cantpartidos Con Paso 1 Hacer
		Mostrar "Ingrese los puntos anotados en los partidos"
		Mostrar "Partido [",cantpartidos,"]"
		Leer puntos
		Mostrar "Partido [",cantpartidos,"]" , puntos 
		
		
		Mientras puntos > 0 Hacer
			puntosTotales = 0
			puntosTotales = puntosTotales + puntos 
			Mostrar "Puntos Totales: " , puntosTotales
	    FinMientras
		mejorPuntuacion <- puntos 
		peorPuntuacion <- puntos
		Si puntos > mejorPuntuacion
			mejorPuntuacion = puntos 
		FinSi
		Si puntos < peorPuntuacion
			mejorPuntuacion = puntos 
		FinSi
		Mostrar "Mejor puntuación: " , mejorPuntuacion
		Mostrar "Peor puntuación: " , peorPuntuacion
	FinPara
	
	Para cantpartidos=1 Hasta cantpartidos Con Paso 1 Hacer
		Mostrar "Partido [",cantpartidos,"]" , puntos 
		Mientras puntos > 0 Hacer
			puntosTotales = 0
			puntosTotales = puntosTotales + puntos 
			Mostrar "Puntos Totales: " , puntosTotales
	    FinMientras
		mejorPuntuacion <- puntos 
		peorPuntuacion <- puntos
		Si puntos > mejorPuntuacion
			mejorPuntuacion = puntos 
		FinSi
		Si puntos < peorPuntuacion
			mejorPuntuacion = puntos 
		FinSi
		Mostrar "Mejor puntuación: " , mejorPuntuacion
		Mostrar "Peor puntuación: " , peorPuntuacion
	FinPara
	
	Mostrar "Total de puntos: " , puntosTotales
	Mostrar "Promedio de puntos por partido" , puntosTotales/cantpartidos
	Mostrar "Mayor puntaje: " , mejorPuntuacion
	Mostrar "Menor puntaje: " , peorPuntuacion
	
	
	
	
FinAlgoritmo
