import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int M = sc.nextInt();

    int maiorTemperatura = Integer.MIN_VALUE;

    int qtdMedicoesFrio = 0;
    int qtdMedicoesNormal = 0;
    int qtdMedicoesAquecido = 0;

    int sequenciaAquecimento = 0;
    int qtdAlertasTecnicos = 0;

    boolean alertaFoiDisparado = false;
    boolean erroNoSensor = false;

    for (int i = 0; i < M; i++) {

        int T = sc.nextInt(); // temperatura
        int A = sc.nextInt(); // equipamentos ativos

        // Verifica erro no sensor
        if (T < 0) {
            erroNoSensor = true;
        }

        // Atualiza maior temperatura
        if (T > maiorTemperatura) {
            maiorTemperatura = T;
        }

        // Verifica superaquecimento
        boolean superaquecido = false;

        if (T > 27) {
            superaquecido = true;
        } else if (A > 50 && T > 25) {
            superaquecido = true;
        }

        // Classificação
        if (superaquecido) {

            qtdMedicoesAquecido++;
            sequenciaAquecimento++;

            // Dispara alerta apenas uma vez por sequência
            if (sequenciaAquecimento >= 4 && !alertaFoiDisparado) {
                qtdAlertasTecnicos++;
                alertaFoiDisparado = true;
            }

        } else if (T < 18) {
            qtdMedicoesFrio++;
            sequenciaAquecimento = 0;
            alertaFoiDisparado = false;
        } else {
            qtdMedicoesNormal++;
            sequenciaAquecimento = 0;
            alertaFoiDisparado = false;
        }
    }

    System.out.println("Maior temperatura: " + maiorTemperatura);
    System.out.println("Frio: " + qtdMedicoesFrio);
    System.out.println("Normal: " + qtdMedicoesNormal);
    System.out.println("Superaquecido: " + qtdMedicoesAquecido);
    System.out.println("Alertas: " + qtdAlertasTecnicos);

    if (erroNoSensor)
        System.out.println("Sensor danificado.");
    else System.out.println("Sistema funcionando.");

    sc.close();
}