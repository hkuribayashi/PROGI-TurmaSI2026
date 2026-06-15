import java.util.Scanner;

int[] criarVetorDeNumeros(){
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[4];
    for (int i=0; i<numeros.length; i++){
        IO.println("Informe um número: ");
        numeros[i] = sc.nextInt();
    }
    return numeros;
}

int calcularMaiorValor(int[] vetor){
    int maiorValor = Integer.MIN_VALUE;
    for (int i=0; i<vetor.length; i++){
        if (vetor[i] > maiorValor)
            maiorValor = vetor[i];
    }
    return maiorValor;
}

int calcularMenorValor(int[] vetor){
    int menorValor = Integer.MAX_VALUE;
    for (int i=0; i<vetor.length; i++){
        if (vetor[i] < menorValor)
            menorValor = vetor[i];
    }
    return menorValor;
}


void main(){
    int[] vetor = criarVetorDeNumeros();

    int maiorValor = calcularMaiorValor(  vetor  );
    IO.println("O maior valor do vetor é: "+maiorValor);

    int menorValor = calcularMenorValor(  vetor  );
    IO.println("O menor valor do vetor é: " + menorValor);
}