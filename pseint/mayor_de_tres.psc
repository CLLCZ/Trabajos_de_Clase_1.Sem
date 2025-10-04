Algoritmo mayor_de_tres
	n1 <- 0
	n2 <- 0
	n3 <- 0
	
	Mostrar "Elige el primer número: "
	leer n1
	
	Mostrar "Elige el segundo número: "
	leer n2
	
	Mostrar  "Elige el tercer número: "
	leer n3
	
	Si n1>n2 Entonces
		Si n1>n3 Entonces
			Mostrar "El primer número es mayor"
		SiNo
			Mostrar "El tercer número es mayor"
		FinSi
		
	SiNo
		Si n2>n3 Entonces
			Mostrar "El segundo número es mayor"
		SiNo
			Mostrar "El tercer número es mayor"
		FinSi
		
	FinSi
	
FinAlgoritmo

