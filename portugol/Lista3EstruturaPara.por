programa
{
	
	funcao inicio()
	{
		inteiro numero,soma = 0

		escreva("Digite um número inteiro positivo: ")
		leia(soma)
		para (inteiro n = 0; n<=500; n++){
			se(n%2 !=1 e n%3 == 0){
				soma = soma+n
				escreva(soma + "\n")
			}
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 177; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */