package controller;

import model.Veiculo;

public class ControleCaminhao extends ControleVeiculo{

    public void movimentacaoVeiculo(Veiculo v) {
        if (v.getId() == 2) {
            int kg = (int)((Math.random()*3000)+1000);
            System.out.println("O veículo estará transportando " + kg + "kg de carga.");
            int km = (int)((Math.random()*3000)+500);
            System.out.println("O veículo irá se deslocar por " + km + "km.");
            int frete = (int)((Math.random()*5000)+2000);
            System.out.println("O frete a ser cobrado será de R$" + frete + " incluindo taxas.");
        }
    }
}
