programa
{
	
	funcao inicio()
	{
		real numeroHora, salario,valorExcedente
	     inteiro codigo
           escreva("Funcionário, digite sua matricula: ")
           leia(codigo)
		escreva("digite o número de horas trabalhadas: ")
		leia(numeroHora)
		se(numeroHora>50){
			valorExcedente = (numeroHora -50)*20
			salario = numeroHora*10
			escreva("valor excedente: ", valorExcedente," Salario: ", salario)
		}
		senao se (numeroHora<50){
			valorExcedente = 0
			salario = numeroHora*10
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
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */