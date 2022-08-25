Algoritmo SueldoWorker
	Definir salario Como Entero
	Definir aumento Como Real
	Escribir "Ingrese el sueldo del trabajador"
	Leer salario
	
	Si salario<1000 Entonces
		aumento=0.15
	SiNo
		aumento=0.12
	Fin Si
	
	nuevoSueldo=salario+(salario*aumento)
	
	Escribir "El nuevo salario del trabajador es de: ",nuevoSueldo,"soles"
	
FinAlgoritmo
