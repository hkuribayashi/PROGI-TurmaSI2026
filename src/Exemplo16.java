import java.util.Random;

void main(){
    int[] numeros = new int[15];
    Random sorteador = new Random();
    for (int i=0; i<=14; i++){
        numeros[i] = sorteador.nextInt(100)+1;
    }

    int qtdNumerosPares = 0;
    for (int i=0; i<=14; i++){

        // Testa o número para saber se ele é par
        if (numeros[i] % 2 == 0)
            qtdNumerosPares++;
    }
    IO.println("A quantidade de números pares é: "+qtdNumerosPares);
}