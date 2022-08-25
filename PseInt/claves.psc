Algoritmo claves
	Escribir "Ingrese el nombre del articulo"
	Leer nombre
	Escribir "Ingrese la clave [01 | 02]"
	Leer clave
	Escribir "Ingrese el precio"
	Leer precio
	Si clave == "01" Entonces
		dscto = 0.10
	SiNo
		dscto = 0.20
	Fin Si
	total = precio - (precio*dscto)
	
	Escribir "Articulo: ", nombre
	Escribir "Precio original: ", precio
	Escribir "Precio Dscto: ", total
	
FinAlgoritmo
