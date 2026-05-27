import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o valor da base: ");
    double base = sc.nextDouble();
    IO.println("Informe o valor da altura: ");
    double altura = sc.nextDouble();
    double area = base * altura;
    IO.println("O valor da área é: " + area);
}