package controller;

import model.Veiculo;

public abstract class ControleVeiculo {

    public void inicioMovimentacao(Veiculo v){
        System.out.println("\nO veículo iniciou a movimentação. \n" + v.toString());
    }

    public abstract void movimentacaoVeiculo(Veiculo v);

}
