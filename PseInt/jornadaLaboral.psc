Algoritmo jornadaLaboral
	Escribir "Ingrese su salario por hora"
	Leer pHora
	Escribir "Ingrese la cantidad de horas que usted ha trabajado"
	Leer horas
	Si horas > 40 Entonces
		Exceso = horas-40
		Si Exceso >8 Entonces
			ExcesoExcesivo=Exceso-8
			pago = (ExcesoExcesivo*pHora*3)+(Exceso*pHora*2)+(40*pHora)
		SiNo
			pago = (Exceso*pHora*2)+(40*pHora)
		Fin Si
	SiNo
		pago = (horas*pHora)
	Fin Si
	
	Escribir "El pago es de: ",pago
	
FinAlgoritmo
