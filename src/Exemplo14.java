import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];
    for (int i=0; i<=4; i++){
        IO.println("Informe um número: ");
        numeros[i] = sc.nextInt();
    }

    int soma = 0;
    for (int i=0; i<=4; i++){
        soma = soma + numeros[i];
    }

    IO.println("A Soma é: " + soma);
}