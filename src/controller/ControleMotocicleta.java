package controller;

import model.Veiculo;

public class ControleMotocicleta extends ControleVeiculo{

    public void movimentacaoVeiculo(Veiculo v) {
        if (v.getId() == 3) {
            int km = (int)((Math.random()*100)+20);
            System.out.println("O veículo irá se deslocar por " + km + "km.");
            int frete = (int)((Math.random()*80)+30);
            System.out.println("O frete a ser cobrado será de R$" + frete + ".");
        }
    }
}
