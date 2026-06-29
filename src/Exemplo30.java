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

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe um número inteiro: ");
    int valor = sc.nextInt();
    IO.println(  ehPrimo( valor )  );
    if ( ehPar(valor) )
        IO.println("Par");
    else IO.println("Ímpar");
}