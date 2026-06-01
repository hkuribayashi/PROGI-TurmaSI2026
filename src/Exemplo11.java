import java.util.Scanner;

void main() {
    int qtdDiasSeca = 0;
    int qtdDiasCheia = 0;
    int qtdDiasNormal = 0;

    int sequenciaDiasSeca = 0;
    int sequenciaDiasCheia = 0;

    int maiorSequenciaDiasSeca = 0;
    int maiorSequenciaDiasCheia = 0;

    int qtdAlertasEspeciais = 0;
    boolean alertaEspecialFoiDisparado = false;

    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();

    for (int i = 0; i < D; i++) {
        int N = sc.nextInt();
        if (N < 30) { //Seca
            qtdDiasSeca++;
            sequenciaDiasSeca++;
            sequenciaDiasCheia = 0;
            if (sequenciaDiasSeca > maiorSequenciaDiasSeca) {
                maiorSequenciaDiasSeca = sequenciaDiasSeca;
            }
            if (sequenciaDiasSeca >= 3 & !alertaEspecialFoiDisparado) {
                qtdAlertasEspeciais++;
                alertaEspecialFoiDisparado = true;
            }


        } else if (N <= 70) { // Operação Normal
            qtdDiasNormal++;
            sequenciaDiasSeca = 0;
            sequenciaDiasCheia = 0;
            alertaEspecialFoiDisparado = false;
        } else { // Cheia
            qtdDiasCheia++;
            sequenciaDiasCheia++;
            sequenciaDiasSeca = 0;

            if (sequenciaDiasCheia > maiorSequenciaDiasCheia) {
                maiorSequenciaDiasCheia = sequenciaDiasCheia;
            }
            if (sequenciaDiasCheia >= 3 & !alertaEspecialFoiDisparado) {
                qtdAlertasEspeciais++;
                alertaEspecialFoiDisparado = true;
            }
        }
    }
    IO.println("Seca: " + qtdDiasSeca);
    IO.println("Normal: " + qtdDiasNormal);
    IO.println("Cheia: " + qtdDiasCheia);
    IO.println("Maior seca consecutiva: " + maiorSequenciaDiasSeca);
    IO.println("Maior cheia consecutiva: " + maiorSequenciaDiasCheia);
    IO.println("Alertas especiais: " + qtdAlertasEspeciais);
    if (qtdAlertasEspeciais == 0)
        IO.println("Sistema Estável");
    else IO.println("Intervenção Necessária");
}