#include <stdio.h>
#include <stdlib.h>

typedef struct no{
	int dado;
	struct no *prox;
	
}Celula;

Celula *inserir(int c, Celula *pilha){
	Celula *novo = (Celula *) malloc(sizeof(Celula));
	novo->dado = c;
	novo->prox = pilha;                         
	return novo;
}

void exibir(Celula *topo) {
    if (!topo) {
        printf("Pilha vazia\n");
        return;
    }
    Celula *p;
    for (p = topo; p ; p = p->prox){
        printf("%d\t", p->dado);
    } 

}

int main(void)
{
  FILE *arq;
  Celula *pilha;
  char c;
  int num;
      
  arq = fopen("arq.txt","r");
  if (arq == NULL)
  {
    printf("Erro, arquivo nao aberto!");
    exit(1);
  }
  printf("Leitura dos dados do arquivo:\n\n"); 
  do
  {        
      c = fgetc(arq);
      num = strtol(c, NULL, 10);
            
      printf("%c" , c);    
	  pilha=inserir(num,pilha);    
	  exibir(pilha);
	  
  }while (c != EOF);
  	  	  	
        fclose(arq);
  system("pause");
  return(0);
}
