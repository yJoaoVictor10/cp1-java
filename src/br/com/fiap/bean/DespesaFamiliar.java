/*
1TDSPG
Nome: João Victor Nascimento Adão | RM: 563409
Nome:
Nome:

*/
package br.com.fiap.bean;

public class DespesaFamiliar {
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas(){
        return gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia * numeroDeMoradores);
    }

    public double calcularRendaFamiliarLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }

}
