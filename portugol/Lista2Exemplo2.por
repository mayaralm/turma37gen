programa
{
	
	funcao inicio()
	{
		real numeroHora, salario,valorExcedente
	     inteiro codigo
           escreva("Funcionário, digite sua matricula: ")
           leia(codigo)
           
		escreva("digite o número de horas trabalhas: ")
		leia(numeroHora)
		se(numeroHora>50){
			valorExcedente = (numeroHora -50)*20
			salario = 50*10
			escreva("valor excedente: ", valorExcedente," Salario: ", salario)
		}
		senao{
			salario = 50*10
			valorExcedente = 0
			escreva("valor excedente: ", valorExcedente," Salario: ", salario)
			
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 189; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */