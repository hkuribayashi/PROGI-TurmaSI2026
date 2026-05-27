import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o número: ");
    int numero = sc.nextInt();
    if ( numero % 2 == 0 ){
        IO.println("O número " + numero + " é Par");
    }else {
        IO.println("O número " + numero + " é Ímpar");
    }
}