Algoritmo calificaciones
	Definir siaprob Como Entero
	Definir noaprob Como Entero
	Definir calif Como Entero
	Definir cant Como Entero
	Definir cont Como Entero
	
	cont = 0
	siaprob = 0
	noaprob = 0
	
	Mostrar "¿Cuántas calificaciones serán ingresadas?"
	Leer cant
	
	Repetir
		Mostrar "calificacion"
		Leer calif
		Si ((calif >= 70) Y (calif <= 100))
			siaprob = siaprob + 1
		SiNo 
			noaprob = noaprob + 1
		FinSi
	Hasta Que (cont = cant)
	
	Mostrar "Calificaciones aprobatorias: " siaprob
	Mostrar "Calificaciones no aprobatorias: " noaprob
	
FinAlgoritmo
