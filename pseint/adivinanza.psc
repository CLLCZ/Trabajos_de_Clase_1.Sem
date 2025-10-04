Algoritmo adivinanza
	Mostrar "Tienes 6 intentos para adivinar un número entre el 1 y 50"
	Definir num Como Entero
	num = azar(50) 
	Definir numeroesco Como Entero
	Definir inten Como Entero
	
	
	
	
	Si numesco > 50 Entonces
		Mostrar "No debe de ser mayor a 50"
	FinSi
	
	Si numesco = 1 Entonces
		Mostrar ""
	FinSi
	
	Mostrar "Intento 1:"
	Leer numesco
	
	
	Mientras numesco > num 
		Mostrar "¡Uy! Te pasaste"
		Mostrar "Te sobran 5 intentos"
		Mostrar "Intento 2:"
		Leer num
	FinMientras
	

	
	
FinAlgoritmo
