char[] criarOutroVetor(char[] palavra){
    char[] reverso = new char[ palavra.length ];
    for (int i=0; i<=reverso.length-1; i++){
        reverso[i] = palavra[ palavra.length-1 - i ];
    }
    return reverso;
}

boolean testarPalidromo(char[] vetor1, char[] vetor2){
    for (int i=0; i<=vetor1.length-1; i++){
        if (vetor1[i] != vetor2[i])
            return false;
    }
    return true;
}

void main(){
    char[] vetor1 = {'r', 'a', 'd', 'a' , 'r'};
    char[] vetor2 = criarOutroVetor(  vetor1 );
    boolean resultado = testarPalidromo( vetor1, vetor2 );
    if (resultado)
        IO.println("Os vetores são palíndromos");
    else IO.println("Os vetores não são palíndromos");
}