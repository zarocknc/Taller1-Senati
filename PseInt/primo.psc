Algoritmo primo
	Escribir "Ingrese el numero inicial: "
	Leer A
	Escribir "Ingrese el numero final"
	Leer B
	CanPrims=0
	Para i <-A Hasta B Hacer
		contador=0
		Para E <- 1 hasta i Hacer
			si i%e==0 Entonces
				contador = contador+1
			FinSi
		FinPara
		Si contador == 2 Entonces
			CanPrims = CanPrims+1
		FinSi
	Fin Para
	
	Escribir "La cantidad de primos en el rango es: ",CanPrims
	
FinAlgoritmo
