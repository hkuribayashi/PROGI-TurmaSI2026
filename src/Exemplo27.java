void verificarTriangulo(double x, double y, double z){
    if (x < y + z && y < x + z && z < y + x){
        if (x == y && y == z )
            IO.println("Triângulo Equilátero");
        else if (x == y || x == z || z == y)
            IO.println("Triângulo Isósceles");
        else IO.println("Triângulo Escaleno");
    }else IO.println("Não é um triângulo");
}

void main(){
    verificarTriangulo(12, 5, 4);
}