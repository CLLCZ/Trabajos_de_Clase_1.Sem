Algoritmo matrices
	
	Definir f, c, g, d Como Real
	Definir sumt, sumf, sumc Como Real
	Definir may, men Como Real
	Mostrar "Ingrese el numero de filas de la matriz"
	leer g
	mostrar "Ingrese el numero de columnas de la matriz"
	leer d
	
	Dimension numef[g,d]
	Para f<-1 Hasta g Con Paso 1 Hacer
		may <- numef[1,1]
		men <- numef[1,1]
		Para c<-1 Hasta d Con Paso 1 Hacer
			Mostrar "Ingresa los valores de la matriz [",f,"][",c,"] = "
			Leer numef[f,c]
			Si numef[f,c] > may Entonces
				may <- numef[f,c]
			FinSi
			Si numef[f,c] < men Entonces
				men <- numef[f,c]
			FinSi
		FinPara
	FinPara
	
	Para f<-1 Hasta g Con Paso 1 Hacer
		Mostrar "  "
		Para c<-1 Hasta d Con Paso 1 Hacer
			Mostrar Sin Saltar "  " numef[f,c] "  |"
			sumt<-sumt + numef[f,c]
		FinPara
	FinPara
	
	Mostrar "    "
	Mostrar "Suma de todos los números ingresados = ", sumt
	
	Para f<-1 Hasta g Con Paso 1 Hacer
		sumf = 0
		Para c<-1 Hasta d Con Paso 1 Hacer
			sumf<-sumf + numef[f,c]
		FinPara
		Mostrar "Suma de fila ",f," = ", sumf
	FinPara
	
	Para c<-1 Hasta d Con Paso 1 Hacer
		sumc = 0
		Para f<-1 Hasta g Con Paso 1 Hacer
			sumc<-sumc + numef[f,c]
		FinPara
		Mostrar "Suma de  columna ",c," = ", sumc
	FinPara
	
	Mostrar "Numero mayor de los números ingresados = ", may
	Mostrar "Numero menor de los numeros ingresados = ", men
	
FinAlgoritmo