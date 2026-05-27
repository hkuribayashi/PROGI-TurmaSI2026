import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    double somaPares = 0;
    double contadorPares = 0;
    int numero = sc.nextInt();
    while (numero != 0){
        if ( numero % 2 == 0){
            // Comentário: somaPares = somaPares + numero;
            somaPares += numero;
            // Comentário: contadorPares = contadorPares + 1;
            contadorPares++;
        }
        numero = sc.nextInt();
    }
    double media = somaPares/contadorPares;
    IO.println("A média de números pares é: "+media);
}