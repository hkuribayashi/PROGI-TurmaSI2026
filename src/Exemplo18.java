import java.util.Scanner;

int[] criarVetorDeNumeros(){
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    for (int i=0; i<numeros.length; i++){
        IO.println("Informe um numero: ");
        numeros[i] = sc.nextInt();
    }
    return numeros;
}

int calcularSoma(int[] vetor){
    int soma = 0;
    for (int i=0; i<vetor.length; i++){
        soma = soma + vetor[i];
    }
    return soma;
}

void main(){
   int[] x = criarVetorDeNumeros();
   IO.println("O valor da soma é: "+ calcularSoma(x));
}