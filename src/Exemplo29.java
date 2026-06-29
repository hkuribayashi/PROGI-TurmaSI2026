import java.util.Scanner;

int calculaAnoBissexto(int n){
    return -45 + (n * 4);
}

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o valor de n: ");
    int n = sc.nextInt();
    int ano = calculaAnoBissexto(n);
    if (ano < -1)
        IO.println("O n-ésimo ano bissexto é: "+ano+"a.c");
    else IO.println("O n-ésimo ano bissexto é: "+ano+"d.c");
}