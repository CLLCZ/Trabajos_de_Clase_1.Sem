Algoritmo Talleres
	Definir tiempo, actini, actfin Como Real
	
	Dimension tallerletra[8]
	tallerletra[1] <- 'a'
	tallerletra[2] <- 'd'
	tallerletra[3] <- 'b'
	tallerletra[4] <- 'c'
	tallerletra[5] <- 'e'
	tallerletra[6] <- 'f'
	tallerletra[7] <- 'g'
	tallerletra[8] <- 'h'
	
	Dimension tallerhora[s,f]
	
	tallerletra[1] <- tallerhora[9,11]
	tallerletra[2] <- tallerhora[9.5,11.5]
	tallerletra[3] <- tallerhora[10,12.5]
	tallerletra[4] <- tallerhora[11.5,12.5]
	tallerletra[5] <- tallerhora[130,14.5]
	tallerletra[6] <- tallerhora[140,160]
	tallerletra[7] <- tallerhora[14.5,15.5]
	tallerletra[8] <- tallerhora[160,170]
	
	
	
	Para n<-1 Hasta 8 Con paso 1 Hacer
		Para m<-1 Hasta s Con Paso 1 Hacer
			Para p<-1 Hasta f Con Paso 1 Hacer
				actini <- tallerhora[s]
				actfin <- tallerhora[f]
				
			FinPara
		FinPara
	FinPara
	
	
	
	
	
	
	
	
	
FinAlgoritmo
