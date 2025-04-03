/*
1TDSPG
Nome: João Victor Nascimento Adão | RM: 563409
Nome:
Nome:

*/
package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesaFamiliar = new DespesaFamiliar();
        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
        int numeroDeMoradores;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o valor da renda familiar: ");
            rendaFamiliar = scanner.nextDouble();

            System.out.print("Digite o número de moradores: ");
            numeroDeMoradores = scanner.nextInt();

            System.out.print("Digite o valor do gasto com luz: ");
            gastoComLuz = scanner.nextDouble();

            System.out.print("Digite o valor do gasto com água: ");
            gastoComAgua = scanner.nextDouble();

            System.out.print("Digite o valor do gasto com internet: ");
            gastoComInternet = scanner.nextDouble();

            System.out.print("Digite o valor da mensalidade da academia: ");
            valorMensalidadeDaAcademia = scanner.nextDouble();

            despesaFamiliar.rendaFamiliar = rendaFamiliar;
            despesaFamiliar.numeroDeMoradores = numeroDeMoradores;
            despesaFamiliar.gastoComLuz = gastoComLuz;
            despesaFamiliar.gastoComAgua = gastoComAgua;
            despesaFamiliar.gastoComInternet = gastoComInternet;
            despesaFamiliar.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            System.out.printf("Registros:\nRenda familiar: R$ %.3f\nTotal de gastos com despesas: R$ %.3f\nRenda familiar líquida: R$ %.3f", despesaFamiliar.rendaFamiliar, despesaFamiliar.calcularTotalDeDespesas(), despesaFamiliar.calcularRendaFamiliarLiquida());
        } catch (Exception e) {
            System.out.println("Informe as credencias corretas!");
        }

    }

}
