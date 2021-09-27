programa
{
	
	funcao inicio()
	{
		inteiro soma = 0,contador=0, numero = 0
		inteiro media
		cadeia opcao = "s"
		
		enquanto(opcao == "s"){
			escreva("digite um valor: ")
			leia(numero)
			soma = soma + numero 			
			contador +=1
			escreva("S/N: ")
			leia(opcao)
		}
		media = soma / contador
		escreva("Soma: ",soma, "\n")
		escreva("Média: ",media)
		escreva("\nTotal de valores lidos:",contador)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */