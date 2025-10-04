Algoritmo parimpar
	Definir nume Como Entero
	Definir res Como Entero
	
	Mostrar "Si el resto de dividir el nùmero a ingresar es igual a cero significa que el nùmero es par, en caso de ser 1 significa que es impar"
	Mostrar "Ingrese el número para saber si es par o impar:"
	Mostrar "Numero: "
	Leer nume
	
	res <- nume MOD 2
	
	Si nume = 0 Entonces
		Mostrar "El número ingresado es par"
		Mostrar "El residuo del nùmero es: " , res
	SiNo 
		Mostrar "El numero ingresado es impar"
		Mostrar "El residuo del nùmero es: " , res
	FinSi
	
FinAlgoritmo
