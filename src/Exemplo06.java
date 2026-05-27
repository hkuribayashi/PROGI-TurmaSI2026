import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Informe o valor total da Compra: ");
    double valorCompra = sc.nextDouble();
    if ( valorCompra > 100.0 ){
        double desconto = valorCompra * 0.10;
        IO.println("Valor Final da Compra: "+(valorCompra - desconto));
    }else {
        IO.println("Valor Final da Compra: "+ valorCompra);
    }
}