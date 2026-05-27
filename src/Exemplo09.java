import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    do{
       IO.println("O valor do contador é: " + contador);
       // Comentário: contador = contador + 1;
        contador++;
    }while(contador < 10);
}