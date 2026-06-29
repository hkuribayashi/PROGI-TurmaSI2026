int fatorial(int n){
    if (n == 0)
        return 1;
    else return n * fatorial(n-1);
}

void main(){
    //Qual o valor do fatorial de 5?
    IO.println( fatorial(5) );
}

