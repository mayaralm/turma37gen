programa
{
	
	funcao inicio()
	{
	inteiro pesoEmKg
	cadeia excesso = "Excesso"
	real multa = 0


	escreva("digite o peso em kg:")
	leia (pesoEmKg)

	se(pesoEmKg>50){
   		multa = (pesoEmKg - 50)*4
	   	escreva(excesso,": ", multa)
	}
	senao{
		escreva(excesso, ": ",multa)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 99; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */