programa
{
	
	funcao inicio()
	{
	  inteiro numero
	  inteiro divisao
	 escreva("Digite um número: ")
	 leia (numero)
	 divisao = (numero/2)
	 se (numero<0){
	 	escreva("Número digitado é negativo.")
	 }
	 senao se(numero==0){
	 	escreva("Número digitado é neutro.")
	 }
	 senao se (numero%2 ==0){
	     escreva("Número digitado é par.")
	}
	  
     senao se (numero%2 ==1){
      	escreva("Número digitado é impar.")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 41; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */