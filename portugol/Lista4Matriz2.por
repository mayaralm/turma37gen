programa
{ // Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e 
   //em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
     //diagonal, ou seja, diagonal principal.
   
	
	funcao inicio()
	{
	  const inteiro tamanho = 3
	  inteiro matriz[tamanho][3], L,C
	  inteiro soma = 0
	  inteiro somaDiagonal = 0


	  para(L = 0;L<tamanho;L++){

	  	para(C = 0;C<3;C++){
	  		escreva("digite um valor: ")
	  		leia(matriz[L][C])
	  		soma = soma + matriz[L][C]
	  		se (L == C){
	  			somaDiagonal += matriz[L][C]
	  		}
	  	}
	  }
	   para(L = 0;L<tamanho;L++){
	   	para(C = 0;C<3;C++){
	   	
	   		escreva("[", matriz[L][C], "]")
	   	}
	   	    
	  		escreva("\n")
	   }
	      escreva("\n A soma total é ", soma)
	      escreva("\n soma diagonal é : ", somaDiagonal)
	  	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */