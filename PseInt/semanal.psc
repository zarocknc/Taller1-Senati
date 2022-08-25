Algoritmo semanal
	Escribir "ingrese las horas que usted ha trabajado"
	Leer horas
	Si horas >40 Entonces
		exceso = horas-40
		pago = (exceso *20)+(40*16)
	SiNo
		pago = (horas*16)
	Fin Si
	
	Escribir "El pago semanal del trabajador sera de: ",pago
FinAlgoritmo
