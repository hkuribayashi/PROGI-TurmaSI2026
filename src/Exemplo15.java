import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[10];
    for (int i=0; i<=9; i++){
        IO.println("Informe um número: ");
        numeros[i] = sc.nextInt();
    }

    int maiorNumero = Integer.MIN_VALUE;
    int menorNumero = Integer.MAX_VALUE;
    for (int i=0; i<=9; i++){
        //Procurar o menor numero
        if (numeros[i] < menorNumero)
            menorNumero = numeros[i];

        // Procurar o maior número
        if (numeros[i] > maiorNumero)
            maiorNumero = numeros[i];
    }

    IO.println("O maior número é: "+maiorNumero);
    IO.println("O menor número é: "+menorNumero);

}