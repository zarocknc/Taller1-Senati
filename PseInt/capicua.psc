Algoritmo capicua
	Escribir "Ingrese el numero inicial: "
	Leer ini
	Escribir "Ingrese el numero final"
	Leer end
	canCapi=0
	para i<-ini hasta end Hacer
		a = (i-(i%100))/100
		b = i % 10
		Si a == b Entonces
			canCapi= canCapi+1
		FinSi
	FinPara
	Escribir "La cantidad de numeros capicua en el rango es: ",canCapi
	
FinAlgoritmo
