Algoritmo areas
	Definir figura Como Caracter
	Definir lado1, lado2 Como Real
	Definir res Como Real
	
	Mostrar "Ingrese la figura de la que quiere calcular el area:"
	Mostrar " > Cuadrado > Rectangulo > Triangulo"
	Leer figura
	
	Segun figura Hacer
		"Cuadrado":
			Mostrar "Ingrese el valor de los lados"
			Mostrar "La formula es: lado x lado" 
			Mostrar "Lado 1 ="
			Leer lado1
			Mostrar "Lado 2 ="
			Leer lado2
			Mostrar "El resultado es:"
			Mostrar lado1 * lado2 " unidades^2"
		"Rectangulo":
			Mostrar "Ingrese el valor de los lados"
			Mostrar "La formula es: base * altura" 
			Mostrar "Base ="
			Leer lado1
			Mostrar "Altura  ="
			Leer lado2
			Mostrar "El resultado es:"
			Mostrar lado1 * lado2 " unidades^2"
		"Triangulo":
			Mostrar "Ingrese el valor de los lados"
			Mostrar "La formula es: base x altura / 2" 
			Mostrar "Base ="
			Leer lado1
			Mostrar "Altura ="
			Leer lado2
			Mostrar "El resultado es:"
			Mostrar lado1 * lado2 / 2 " unidades^2"
	FinSegun
	
FinAlgoritmo
