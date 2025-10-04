Algoritmo pares_de_tamano20
	
	Definir pars Como Entero
	Dimension arreglo[20]
	
	pars = -1
	pars = pars +1
	c = 1
	
	Mostrar "Los primeros 20 números pares son: "
	
    Mientras pars < 40
		pars = pars + 1
		Si pars mod 2 = 0
			arreglo[c]=pars
			Mostrar pars
			c=c+1
		FinSi
	FinMientras
	
	
	Para i=1 Hasta 20 Con Paso 1 Hacer
		Mostrar "Par[",i,"]", arreglo[i]
	FinPara
	
FinAlgoritmo
