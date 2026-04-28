import java.util.Scanner;

public class CalculadoraPintura4261216310 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- PaintMaster v1.0: Calculadora de Reforma ---");

        final double ALTURA_PAREDE = 2.7; //metros
        final double RENDIMENTO_LITRO = 10.0; // m² por litro
        final double DESCONTO_ABERTURAS = 0.10; // 10% para portas/janelas

        System.out.println("Digite o comprimento de um dos lados do quarto (em metros): ");
        double lado = sc.nextDouble();

        double areaUmaParede = lado * ALTURA_PAREDE;
        double areaTotalParedes = areaUmaParede * 4;

        // Aplicando o desconto de portas e janelas
        double areaLiquida = areaTotalParedes * (1 - DESCONTO_ABERTURAS);
        
        // Calculo Final litros
        double litrosNecessarios = areaLiquida / RENDIMENTO_LITRO;

        System.out.println("\n--- Resumo do Orçamento ---");
        System.out.printf("Área bruta das paredes: %.2f m²\n", areaTotalParedes);
        System.out.printf("Área a ser pintada (com descontos): %.2f m²\n", areaLiquida);
        System.out.printf("Total de tinta necessária: %.2f Litros\n", litrosNecessarios);
        System.out.println("--------------------------");

      sc.close();
    }
} 