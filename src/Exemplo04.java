import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o nome do Funcionário: ");
    String nome = sc.next();
    IO.println("Informe o número de horas trabalhadas: ");
    double horas = sc.nextDouble();
    IO.println("Informe o valor que recebe por hora: ");
    double valorPorHora = sc.nextDouble();
    IO.println("Nome do Funcionário: " + nome);
    IO.println("Salário do Funcionário: " + horas * valorPorHora);
}