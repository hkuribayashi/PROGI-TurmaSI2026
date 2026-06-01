import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("Informe quantas notas deseja armazenar: ");
    int quantidade = sc.nextInt();
    double[] notas = new double[quantidade];

    // Leitura das Notas
    for (int i = 0; i < quantidade; i++) {
        IO.println("Informe uma nota: ");
        notas[i] = sc.nextDouble();
    }

    // Escrita das Notas na Tela
    for (int i = 0; i < notas.length; i++) {
        IO.println(notas[i]);
    }
}