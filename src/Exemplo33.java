import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int E = sc.nextInt();

    int qtdVazio = 0;
    int qtdNormal = 0;
    int qtdLotado = 0;

    int sequenciaLotado = 0;
    int qtdAlertasOperacionais = 0;
    boolean alertaOperacional = false;
    boolean erroNoSensor = false;

    int saldoPassageiros = 0;
    int maiorSaldo = 0;

    for (int i=0; i<E; i++){
        int P = sc.nextInt();
        int S = sc.nextInt();
        saldoPassageiros = saldoPassageiros + (P - S);

        if (saldoPassageiros < 0)
            erroNoSensor = true;

        if (saldoPassageiros < 20){
            qtdVazio++;
            alertaOperacional = false;
            sequenciaLotado = 0;
        }else if (saldoPassageiros <= 99){
            qtdNormal++;
            alertaOperacional = false;
            sequenciaLotado = 0;
        }else{
            qtdLotado++;
            sequenciaLotado++;

            if (sequenciaLotado >= 4 & !alertaOperacional){
                qtdAlertasOperacionais++;
                alertaOperacional = true;
            }
        }

        if (saldoPassageiros > maiorSaldo)
            maiorSaldo = saldoPassageiros;
    }

    IO.println("Maior quantidade: "+maiorSaldo);
    IO.println("Vazio: "+qtdVazio);
    IO.println("Normal: "+qtdNormal);
    IO.println("Lotado: "+qtdLotado);
    IO.println("Alertas: "+qtdAlertasOperacionais);
    if (erroNoSensor)
        IO.println("Sensor com defeito.");
    else IO.println("Sistema Operacional.");
}