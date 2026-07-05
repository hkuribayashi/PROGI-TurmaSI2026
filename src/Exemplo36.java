// Escreva um programa que solicita 5 valores ao usuário, armazena esses
//valores em um array chamado vet1 de inteiros. Depois, faça com que vet1 seja copiado
//para vet2 de forma invertida (por meio de uma função), conforme o exemplo:

import java.util.Scanner;

int[] criarVetor(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o tamano do vetor");
    int tamanhoDoVetor = sc.nextInt();
    int[] vet = new int[tamanhoDoVetor];
    for (int i=0; i<vet.length; i++){
        IO.println("Informe um valor inteiro");
        vet[i] = sc.nextInt();
    }
    return vet;
}

int[] criarVetorInvertido(int[] primeiroVetor){
    int[] vetorInvertido = new int[primeiroVetor.length];
    for (int i=0; i<vetorInvertido.length; i++){
        vetorInvertido[i] = primeiroVetor[primeiroVetor.length-1 -i];
    }
    return vetorInvertido;
}

void imprimirVetor(int[] vetor){
    for (int i=0; i<vetor.length; i++){
        IO.print( vetor[i] + " ");
    }
}

void main(){
    int[] vet1 = criarVetor();
    int[] vet2 = criarVetorInvertido( vet1 );
    IO.println("Imprimindo o Primeiro Vetor: ");
    imprimirVetor( vet1 );
    IO.println("Imprimindo o Segundo Vetor: ");
    imprimirVetor( vet2 );

}