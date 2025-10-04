Algoritmo adivinanza
	Mostrar "Tienes 6 intentos para adivinar un número entre el 1 y 50"
	Definir num Como Entero
	num = azar(50) 
	Definir numesco Como Entero
	Definir inten Como Entero
	
	
	Mientras inten < 6 y numesco <> num Hacer 
		inten = inten + 1
		Mostrar "Intento #", inten
			Leer numesco
			Si numesco > 50 Entonces
				Mostrar "No debe de ser mayor a 50"
			FinSi
			Si numesco > num 
				Mostrar "¡Uy! Te pasaste"
			FinSi
			Si numesco < num 
				Mostrar "¡Uy! Te falta"
			FinSi
			Si numesco = num
				Mostrar "¡Felicidades!" 
				Mostrar "Adivinaste el número"
			FinSi
			
	FinMientras
	
	Si numesco <> num Entonces
		Mostrar "Tus intentos terminaron, el número era: ", num
	FinSi
	
FinAlgoritmo
