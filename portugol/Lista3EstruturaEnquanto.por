programa
{
	
	funcao inicio()
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
apresente no final o total do somatório, a média e o total de valores lidos. O programa
deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
negativo. 
	 */


	
	{
		inteiro soma = 0,contador=0, numero = 0
		inteiro media
		
		enquanto(numero >= 0){
			escreva("digite um valor: ")
			leia(numero)
			soma = soma + numero 			
			contador +=1	
			
		}
		 se (numero<=0){
		 	media = soma / contador
		escreva("Soma: ",soma, "\n")
		escreva("Média: ",media)
		escreva("\nTotal de valores lidos:",contador)
		 }
		


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 716; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */