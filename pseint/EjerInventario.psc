Algoritmo Inventario
	Definir cantProductos Como Entero
	Definir totalInventario Como Real
	Definir cantidadMovimiento, op Como Entero
	Definir precio, stockin, stockac Como Real
	Definir productoBuscar como cadena
	Mostrar "Ingrese la cantidad de productos a ingresar"
	leer cantProductos
	Dimension Producto[cantProductos]
	
	Para f=1 Hasta cantProductos Con Paso 1 Hacer
		Mostrar "Ingrese el nombre del Producto [",f,"]"
		leer Producto[f]
		productoBuscar <- Producto[f]
		Mostrar "Ingrese el precio del producto"
		leer precio
		Mostrar "Ingrese la cantidad de stock inicial"
		leer stockin
	FinPara
	Para f=1 Hasta cantProductos Con Paso 1 Hacer
		Mostrar "Producto[",f,"]", Producto[f],"   ", "Precio", "    ",precio, "   ","Stock inicial", "   ",stockin
	FinPara
	Para f=1 Hasta cantProductos Con Paso 1 Hacer
	    Mostrar "Valor total del inventario"
	    totalInventario=totalInventario+precio
	    Mostrar totalInventario
	FinPara
	Para f=1 Hasta cantProductos Con Paso 1 Hacer
	    op <- 0
	    Mostrar "¿Desea actualizar el stock de un producto?"
 	    Mostrar "Opciones : 1 Para Revisar 2 Para Actualizar 3 Para ver Inventario 4 Para Finalizar Inventario 5 Para Salir de menú "
	    Repetir
			Mostrar "Ingrese el numero de la opción"
		    leer op
		    Si op = 1 Entonces
		        Mostrar "¿De que producto desea revisar el stock?"
			    leer productoBuscar
			    Mostrar "Stock inicial=  ", stockin
			    Mostrar "Stock actual=   ", stockac
		    FinSi
		    Si op = 2 Entonces
			    Mostrar "¿De que producto desea actualizar el stock?"
				leer productoBuscar
			    Mostrar "Ingrese la cantidad a mover"
			    leer cantidadMovimiento
			    stockac= stockin - cantidadMovimiento
			    Mostrar "Stock actual =   ", stockac
		    FinSi
			Si op = 3 Entonces
				Mostrar "Inventario actual:"
				Dimension Inv[3,f] 
				Para f<-1 Hasta cantProductos Con Paso 1 Hacer
					Inv[1,f] <- precio
					Inv[2,f] <- stockin
					Inv[3,f] <- stockac
					Repetir
						Mostrar Producto[f] "  ," precio ",  " stockin ",  " stockac 
						Mostrar "¿Desea finalizar?"
						leer op
					Hasta Que op = 4
					
				FinPara
			FinSi
		    Si op = 5 Entonces
				Mostrar "Finalizando menú"
		    FinSi
	    Hasta Que op=5
    FinPara
	sbajo <- Producto[1]
	pmayor <- Producto[1]
	Para f<- 1 Hasta cantProductos Con Paso 1 Hacer
		a <- Producto[f]
		si a > pmayor Entonces
			pmayor = a
		FinSi
		si a < sbajo Entonces
			sbajo = a
		FinSi
	FinPara
	Mostrar "Producto con stock mas bajo:" ,sbajo
	Mostrar "Producto con el precio mas alto: " ,pmayor
	
	
FinAlgoritmo
