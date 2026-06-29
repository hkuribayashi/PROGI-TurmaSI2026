import java.util.Scanner;

boolean ehPrimo(int numero){
    for (int i=2; i<=numero-1; i++) {
        if (numero % i == 0)
            return false;
    }
    return true;
}

boolean ehPar(int numero){
    //if (numero % 2 == 0)
    //    return true;
    //else return false;
    return (numero % 2 == 0);
}

int contagemNumerosPares(int[] vetor){
    int contador = 0;
    for (int i=0; i<vetor.length; i++){
        if ( ehPar( vetor[i] ) )
            contador++;
    }
    return contador;
}

int contagemNumerosPrimos(int[] vetor){
    int contador = 0;
    for (int i=0; i<vetor.length; i++)
        if ( ehPrimo(vetor[i]) )
            contador++;
    return contador;
}

void main(){
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[10];
    for (int i=0; i<10; i++){
        IO.println("Informe um valor inteiro: ");
        vetor[i] = sc.nextInt();
    }

    int totalNumerosPares = contagemNumerosPares(vetor);
    IO.println("Tot. de Números Pares: "+totalNumerosPares);
    IO.println("Tot. de Números Ímpares: " + (10-totalNumerosPares) );
    IO.println("Tot. de Números Primos: "+ contagemNumerosPrimos(vetor) );
}