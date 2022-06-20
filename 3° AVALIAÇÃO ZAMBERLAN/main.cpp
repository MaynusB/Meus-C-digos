//1) A partir de um arquivo txt, com números inteiros, um abaixo do outro, faça um programa em C++ que abra este arquivo e o popule em uma árvore binária de pesquisa.
//Entretanto, o código não deve perrmitir números repetidos. Sugere-se que a árvore esteja balanceada e que se use um arquivo .h para os métodos de árvore.

//2) A partir do código anterior, faça um programa em C++ (seprando o código principal .cpp dos métodos de árvore .h) para verificar se o menor valor e o 
//maior valor estão no mesmo nível da árvore. O método deve retornar 1 ou True se os valores estiverem no mesmo nível, caso contrário 0 ou False.

//3) Faça um método que receba um ponteiro para uma árvore binária de pesquisa e um valor inteiro. O método deve retornar 1 ou True se o valor não for folha,
//caso contrário 0 ou False.

#include <iostream>
#include <cstdlib>

using namespace std;

#include "arvores.h"

int main() {
    Arvore *raiz = NULL;

    //Utilize o número 15(Ou qualquer outro número que desejar) para testar a questão 1.
    raiz = inserir(50, raiz);
    raiz = inserir(25, raiz);
    raiz = inserir(5, raiz);
    raiz = inserir(15, raiz);
    //raiz = inserir(15, raiz);
    raiz = inserir(6, raiz);
    
    
    exibir(raiz,0);

    raiz = excluir(6, raiz);

    //QUESTÃO 1
    if (inserir(raiz->valor, raiz) == inserir(raiz->valor, raiz)){
       cout << "\nNão possui números repetidos \n\n";
      }else{
       cout << "\nPossui números repetidos \n\n";
      }

    //QUESTÃO 2    
    if(*menorElemento == *maiorElemento){
      cout << "\nEstão no mesmo nível\n\n";
         return 1;
       }else{
       cout << "\nNão estão no mesmo nível\n\n";
         return 0;
       }

    //QUESTÃO 3 => NÃO FEITA
    
  
    
    
   
    //cout << "\nArvore apos exclusão: \n\n";
    //exibir(raiz,0);

    
    return 1;

}