import java.util.Scanner;

int[] criarVetorTemperaturas(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] temperaturas = new int[n];
    for (int i=0; i<n; i++){
        temperaturas[i] = sc.nextInt();
    }
    return temperaturas;
}

int calcularMaiorTemperatura(int[] temperaturas){
    int maior = Integer.MIN_VALUE;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] > maior)
            maior = temperaturas[i];
    }
    return maior;
}

int calcularMenorTemperatura(int[]  temperaturas){
    int menor = Integer.MAX_VALUE;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] < menor)
            menor = temperaturas[i];
    }
    return menor;
}

double calcularTemperaturaMedia(int[] temperaturas){
    double soma = 0;
    for (int i=0; i<temperaturas.length; i++){
        soma = soma + temperaturas[i];
    }
    return soma/temperaturas.length;
}

int calcularTemperaturaA18(int[] temperaturas){
    int qtdTemperaturasA18 = 0;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] < 18)
            qtdTemperaturasA18++;
    }
    return qtdTemperaturasA18;
}

int calcularTemperaturaE18e30(int[] temperaturas){
    int qtdTemperaturasE18e30 = 0;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] >= 18 && temperaturas[i] <= 30)
            qtdTemperaturasE18e30++;
    }
    return qtdTemperaturasE18e30;
}

int calcularTemperaturaA30(int[] temperaturas){
    int qtdTemperaturasA30 = 0;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] > 30)
            qtdTemperaturasA30++;
    }
    return qtdTemperaturasA30;
}

void verificarTemperaturaNegativa(int[] temperaturas){
    boolean alertaDeTemperaturaNegativa = false;
    for (int i=0; i<temperaturas.length; i++){
        if (temperaturas[i] < 0) {
            alertaDeTemperaturaNegativa = true;
            //break; (opcional)
        }
    }
    if (alertaDeTemperaturaNegativa)
        IO.println("Alerta de Sensor");
    else IO.println("Sistema Funcionando");
}

void main(){
    int[] temperaturas = criarVetorTemperaturas();

    int maiorTemperatura = calcularMaiorTemperatura( temperaturas );
    IO.println("Maior Temperatura: "+maiorTemperatura);

    int menorTemperatura = calcularMenorTemperatura( temperaturas );
    IO.println("Menor Temperatura: "+menorTemperatura);

    double media = calcularTemperaturaMedia( temperaturas );
    IO.println("Media: "+media);

    int qtdAbaixo18 = calcularTemperaturaA18( temperaturas );
    IO.println("Abaixo de 18: "+qtdAbaixo18);

    int qtdE18e30 = calcularTemperaturaE18e30( temperaturas );
    IO.println("Entre 18 e 30: "+qtdE18e30);

    int qtdAcima30 = calcularTemperaturaA30( temperaturas );
    IO.println("Acima de 30: "+qtdAcima30);

    verificarTemperaturaNegativa( temperaturas );
}