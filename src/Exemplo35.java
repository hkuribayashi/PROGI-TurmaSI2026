// Questão 05: Ler um conjunto de números reais (double), armazenando-o em vetor e
//calcular o quadrado das componentes deste vetor, armazenando o resultado em outro
//vetor. Os conjuntos têem 10 elementos cada. Imprimir todos os conjuntos.

import java.util.Scanner;

double[] criarVetor(){
    Scanner sc = new Scanner(System.in);
    double[] vetor = new double[10];
    for (int i=0; i<vetor.length; i++){
        IO.println("Informe um número real (double): ");
        vetor[i] = sc.nextDouble();
    }
    return vetor;
}

double[] criarVetorAoQuadrado(double[] primeiroVetor){
    double[] segundoVetor = new double[primeiroVetor.length];
    for (int i=0; i<segundoVetor.length; i++){
        segundoVetor[i] = primeiroVetor[i] * primeiroVetor[i];
    }
    return segundoVetor;
}

void imprimirVetor(double[] vetor){
    for (int i=0; i<vetor.length; i++){
        IO.print( vetor[i] + " ");
    }
}

void main(){
    double[] meuVetor = criarVetor();
    double[] novoVetor = criarVetorAoQuadrado( meuVetor );
    IO.println("Imprimindo os valores do primeiro vetor: ");
    imprimirVetor( meuVetor );
    IO.println("Imprimindo os valores do segundo vetor: ");
    imprimirVetor( novoVetor );

}