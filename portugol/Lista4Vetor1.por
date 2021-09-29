programa
{
	
	funcao inicio()
	{
	  inteiro pontuacao[5], y = 0,maiorPontuacao = 0 
	  para (y=0;y<5;y++){
	  	escreva("digite maior pontuação: ")
	  	leia(pontuacao[y])
	  	
	  }
	  para (y=0;y<5;y++){
	  se (maiorPontuacao < pontuacao[y]){
	  	maiorPontuacao = pontuacao[y]
	  }
	  }
	   escreva("\nA maior pontuação é: " + maiorPontuacao)
	  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */