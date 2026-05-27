import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    double altura;
    double raio;
    IO.println("Informe o valor da altura: ");
    altura = sc.nextDouble();
    IO.println("Informe o valor do raio: ");
    raio = sc.nextDouble();
    double volume = Math.PI * raio * raio * altura;
    IO.println("O valor do volume é: " + volume);
}