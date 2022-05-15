package controller;

import model.Veiculo;

public class ControleVan extends ControleVeiculo{

    public void movimentacaoVeiculo(Veiculo v) {
        if (v.getId() == 4) {
            int pax = (int)((Math.random()*12)+3);
            System.out.println("O número de passageiros a serem transportados é de " + pax + " pessoas.");
            int paradas = (int)((Math.random()*12)+3);
            System.out.println("O número de paradas que serão realizadas durante o trajeto será de " + paradas + " paradas.");
        }
    }
}
