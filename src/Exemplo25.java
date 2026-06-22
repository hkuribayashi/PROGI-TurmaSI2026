int calculaEdicao(int n){
    int ano = 1930;
    int numeroDeCopas = 1;
    do{
        ano = ano + 4;
        if (ano == 1942 || ano == 1946)
            continue;
        numeroDeCopas = numeroDeCopas + 1;
    }while(numeroDeCopas < n);
    return ano;
}

void main(){
    int anoCopa = calculaEdicao(10);
    IO.println("A edição n.10 foi no ano de "+anoCopa);

}