Algoritmo cajero_autom
	Definir saldoinic Como Entero
	Definir opc Como Entero
	Definir saldodepo Como Entero
	Definir saldoreti Como Entero
	Definir saldo Como Entero
	Definir resp Como Caracter
	
	saldoinic <- 5000
	saldodepo <- 0
	saldoreti <- 0
	opc <- 0

	Mostrar "¿Qué desea realizar hoy?"
	Mostrar "Menú:"
	Mostrar "Opción 1: Consultar saldo"
	Mostrar "Opción 2: Depositar Dinero"
	Mostrar "Ocpción 3: Retirar Dinero"
	Mostrar "Opción 4: Salir "
	
	Repetir
		Mostrar "Ingrese el número de la opción a realizar:"
		Leer opc 
		Si opc = 1 Entonces
			Mostrar "Su saldo es de: "
			Mostrar saldoinic + saldodepo - saldoreti
		FinSi
		
		Si opc = 2 Entonces
			Mostrar "Ingrese la cantidad a depositar: "
			Leer saldodepo
			Mostrar "Confirme la operación, por favor"
			Mostrar " >Si  >No"
			Leer resp 
			Si resp = "Si" Entonces
				Mostrar "Movimiento confirmado"
				Mostrar "Su saldo actual es de: " saldoinic + saldodepo - saldoreti
			SiNo 
				Mostrar "Movimiento cancelado"
			FinSi
		FinSi
		
		Si opc = 3 Entonces
			Mostrar "Ingrese la cantidad a retirar: "
			Leer saldoreti 
			
			Si saldoreti > saldoinic + saldodepo - saldoreti
				Mostrar "Saldo insuficiente"
			FinSi
			
			Si saldoreti <= saldoinic + saldodepo - saldoreti
				Mostrar "Confirme la operación, por favor"
				Mostrar " >Si  >No"
				Leer resp 
				Si resp = "Si" Entonces
					Mostrar "Movimiento confirmado"
					Mostrar "Su saldo actual es de: ", saldoinic + saldodepo - saldoreti
				SiNo 
					Mostrar "Movimiento cancelado"
				FinSi
			FinSi
		FinSi
		
		Si opc = 4 Entonces
			Mostrar "Gracias por usar este cajero, que tenga un buen día"
		FinSi
		
		Si opc >= 5 Entonces
			Mostrar "Opción no valida"
		FinSi
	Hasta Que opc = 4 
	
FinAlgoritmo
