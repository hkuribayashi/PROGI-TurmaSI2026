String classificarIdade(int idade){
    String classificacao = "";
    if (idade < 12)
        classificacao = "Criança";
    else if (idade < 18)
        classificacao = "Adolescente";
    else if (idade < 60)
        classificacao = "Adulto";
    else classificacao = "Idoso";
    return classificacao;
}

String classificarIdade2(int idade){
    if (idade < 12)
        return "Criança";
    else if (idade < 18)
        return "Adolescente";
    else if (idade < 60)
        return "Adulto";
    else return "Idoso";
}

String gerarMensagem(String nome, int idade){
    return "Olá "+nome+", você é "+classificarIdade(idade);
}

void main(){
    IO.println( gerarMensagem("Julia", 16) );
}

