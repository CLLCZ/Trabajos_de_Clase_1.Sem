Algoritmo operaritm2
	Definir numero1, numero2 Como Real
	Mostrar "Ingresa el primer numero: "
	Leer numero1
	
	Mostrar "Ingresa el segundo numero: "
	Leer numero2
	
	Definir operador Como Real
	Mostrar "Ingresa el número según el operador que necesitas utilizar: " 
	Mostrar "1 es +"
	Mostrar "2 es -"
	Mostrar "3 es *"
	Mostrar "4 es / "
	Leer operador
	
	Segun operador Hacer
		 1:
			resultado = numero1 + numero2
			Mostrar "El resultado es: ", resultado
		2:
			resultado = numero1 - numero2
			Mostrar "El resultado es: ", resultado
		3:
			resultado = numero1 * numero2
			Mostrar "El resultado es: ", resultado
		4:
			resultado = numero1 / numero2
			Mostrar "El resultado es: ", resultado
	FinSegun
	
	
FinAlgoritmo
