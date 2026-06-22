import java.util.Scanner;

boolean verificarTriangulo(double a, double b, double c){
    if (a*a == b*b + c*c)
        return true;
    else return false;
}

void main(){
    Scanner sc = new Scanner(System.in);
    while(true){
        IO.println("Informe o valor da hipotenusa: ");
        double hip = sc.nextDouble();
        IO.println("Informe o valor do primeiro cateto: ");
        double cat1 = sc.nextDouble();
        IO.println("Informe o valor do segundo cateto: ");
        double cat2 = sc.nextDouble();
        if (hip < 0 || cat1 < 0 || cat2 < 0)
            break;
        else {
            boolean result = verificarTriangulo(hip, cat1, cat2);
            if (result)
                IO.println("O triângulo é retângulo!");
            else IO.println("O triângulo não é retângulo");
        }
    }
}