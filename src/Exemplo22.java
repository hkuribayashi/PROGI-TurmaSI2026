boolean verificarMultiplos(int a, int b){
    if (a > 0 && b > 0){
        if (a % b == 0 | b % a == 0)
            return true;
        else return false;
    }else return false;
}

void main(){
    IO.println( verificarMultiplos(25, 25)  );
}