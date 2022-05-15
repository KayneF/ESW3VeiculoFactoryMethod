package controller;

import model.Veiculo;

public class ControleAutomovel extends ControleVeiculo {

    public void movimentacaoVeiculo(Veiculo v) {
        if (v.getId() == 1) {
            int tempo = 0;
            int seg = (int) ((Math.random() * 30) + 10);
            for (int i = 0; i < 100; i++) {
                tempo = (seg * i);
                tempo = (tempo / 60);
            }
            System.out.println("Tempo para atingir a velocidade de 100kmh: " + tempo + "seg.");

            int km = (int) ((Math.random() * 650) + 50);
            tempo = (km / 100);
            System.out.println("O veículo levará aproximadamente " + tempo + "h para se deslocar por " + km + "km.");

            int pax = (int) ((Math.random() * 4) + 1);
            System.out.println("O veículo estará transportando " + pax + " passageiros.");
        }
    }
}
