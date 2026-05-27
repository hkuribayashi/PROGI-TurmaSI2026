import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int codigo = sc.nextInt();
    while(codigo >= 0){
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double media = 0;
        if (nota1 >= nota2 & nota1 >= nota3){
            media = (4*nota1 + 3*nota2 + 3*nota3)/10;
        }else if (nota2 >= nota1 & nota2 >= nota3){
                 media = (3*nota1 + 4*nota2 + 3*nota3)/10;
        }else {
            media = (3*nota1 + 3*nota2 + 4*nota3)/10;
        }
        IO.println("Código do Aluno: " + codigo);
        IO.println("Nota 1: " + nota1);
        IO.println("Nota 2: " + nota2);
        IO.println("Nota 3: " + nota3);
        IO.println("Média: " + media);
        if (media >=5){
            IO.println("APROVADO");
        }else {
            IO.println("REPROVADO");
        }
        // Lendo o próximo código de aluno
        codigo = sc.nextInt();
    }
}