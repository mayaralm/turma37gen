programa
{
	inclua biblioteca Objetos
	
	funcao inicio()
	{
		cadeia codigo[10] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"}
		cadeia produto[10] = {"teclado        ","mouse        ","cadeira        ","gabinetes    ","memoria ram    ","monitor      ","headset        ","suporteNote  ","mousepad     ","notebook    "}
		inteiro valor[10] = {40,20,500,400,45,600,40,80,10,2000}
		inteiro estoque[10] = {10 ,10 ,10 ,10 ,10 ,10 ,10 ,10,10,10}
		caracter desejo = ' '
		cadeia produtoSelect = ""
		inteiro qtEstoque
		
		
		escreva("BEM VINDE(S) A DEVSTORE \n")
		escreva("A LOJA DO DESENVOLVEDORE!\n")
		escreva("")

		enquanto (desejo != 'S' ou desejo != 's' ou desejo !='N' ou desejo != 'n'){
				escreva("Deseja fazer compras? Digite S/N:  ")
        			leia(desejo)
        		se (desejo == 'S' ou desejo == 's'){
			escreva("LISTA DE PRODUTOS\n")
			escreva("Cod.\t"," ","Prod.\t","    ","     Valor\t"  ,"     ","        Estoque\t\n")
				para (inteiro i = 0; i < 10; i++){
					escreva(codigo[i],"\t", produto[i],"\t R$",valor[i],"\t" ,"               ", estoque[i] ,"\t\n")
					
				}
				
				
			}
				escreva("\ngostaria de comprar nosso produtos? ")
				leia(desejo)
				se (desejo == 'S' ou desejo =='s'){
					escreva("digite o codigo do produto:")
					leia (produtoSelect)

					se (produtoSelect == codigo[0] ou produtoSelect == codigo[1] ou produtoSelect == codigo[2] ou produtoSelect == codigo[3] ou produtoSelect == codigo [4] ou produtoSelect == codigo [5] ou produtoSelect == codigo[6] ou produtoSelect == codigo[7] ou produtoSelect == codigo[8] ou produtoSelect == codigo [9]){
						faca{
						qtEstoque = estoque[0] -1				   	
						qtEstoque = estoque[1] -1
						qtEstoque = estoque[2] -1
						qtEstoque = estoque[3] -1
						qtEstoque = estoque[4] -1
						qtEstoque = estoque[5] -1
						qtEstoque = estoque[6] -1
						qtEstoque = estoque[7] -1
						qtEstoque = estoque[8] -1
						qtEstoque = estoque[9] -1
						}
						enquanto(estoque[0] <= 0 ou estoque[1] <= 0 ou estoque[2] <= 0 ou estoque[3] <= 0 ou estoque[4] <= 0 ou estoque[5] <=0 ou estoque [6] <= 0 ou estoque[7] <= 0 ou estoque[8] <= 0 ou estoque [9] <= 0  )
							escreva(qtEstoque)
					}
				}
				senao se (desejo == 'N' ou desejo == 'n') {
				limpa()
				escreva("Obrigado, volte sempre!")
				
			}
        			
			}
		}
		
			
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */