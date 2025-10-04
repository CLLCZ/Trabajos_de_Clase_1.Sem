Algoritmo dianum
	Definir numdia Como Entero
	Definir dia Como Caracter
	
	Mostrar "Ingrese el numero del dìa a saber, el numero debe de ser entre el 1 y el 7"
	Leer numdia
	
	Segun numdia Hacer
		1: 
			Mostrar "El dia 1 es Domingo"
		2:
			Mostrar "El dìa 2 es Lunes"
		3:
			Mostrar "El dia 3 es Martes"
		4:
			Mostrar "El dìa 4 es Miercoles"
		5:
			Mostrar "El dia 5 es Jueves"
		6: 
			Mostrar "El dìa 6 es Viernes"
		7: 
			Mostrar "El dia 7 Sabado"
	FinSegun
	
	Si numdia >= 8
		Mostrar "Numero no compatible con el programa"
	FinSi
	
FinAlgoritmo
