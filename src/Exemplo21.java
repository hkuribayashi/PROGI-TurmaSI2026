void exibirSeparador(){
    IO.println("******************************************");
}

void exibirNomeIdade(String nome, int idade){
    IO.println("Olá "+nome+"! Você tem "+idade+" anos de idade");
}

void main(){
    exibirSeparador();
    exibirNomeIdade("Julia", 16);
    exibirSeparador();
}