import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o primeiro valor: ");
    double soma = sc.nextDouble();
    IO.println("Informe o segundo valor: ");
    soma += sc.nextDouble();
    IO.println("Informe o terceiro valor: ");
    soma += sc.nextDouble();
    double media = soma/3;
    IO.println("O valor da média é: " + media);
}