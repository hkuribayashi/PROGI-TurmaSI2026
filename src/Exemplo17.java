import java.util.Scanner;

int minhaFuncao(int x){
    int y = (2*x) + 1;
    return y;
}

double calcularAreaRetangulo(double x, double y){
    double area = x * y;
    return area;
}

void main(){
    Scanner sc = new Scanner(System.in);
    IO.println(  minhaFuncao(7)  );

    IO.println("Informe o valor da Base: ");
    double valorBase = sc.nextDouble();
    IO.println("Informe o valor da Altura: ");
    double valorAltura = sc.nextDouble();
    double area = calcularAreaRetangulo(valorBase, valorAltura);
    IO.println("O valor da área é: " + area );
}
