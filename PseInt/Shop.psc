Algoritmo Shop
	Escribir "ingrese el codigo de barras"
	leer Cbarra
	Escribir "ingrese la cantidad del articulo"
	Leer cantidad
	Escribir "ingrese el costo del articulo"
	leer costo
	
	Si cantidad >= 4 Entonces
		Reducir=(cantidad-(cantidad MOD 4 ))/4
		cantidadACobrar = cantidad - Reducir
	SiNo
		cantidadACobrar = cantidad
	Fin Si
	
	importe = cantidadACobrar * costo
	Si importe>300 Entonces
		dscto = 0.10
	SiNo
		dscto =0
	Fin Si
	
	importeFinal = importe+(importe*dscto)
	
	Escribir "Codigo de barras: ",Cbarra
	Escribir "Cantidad de artículos", cantidad
	Escribir "Cantidad a pagar", cantidadACobrar
	Escribir "Costo del articulo", costo
	Escribir "Total a pagar",importeFinal
	
	
	
FinAlgoritmo
