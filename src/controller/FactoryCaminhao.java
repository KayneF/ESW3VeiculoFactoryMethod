package controller;

import model.Caminhao;

public class FactoryCaminhao extends FactoryVeiculo {

    public model.Veiculo setVeiculo(model.Veiculo v) {
        if (v.getId() == 2) {
            Caminhao ve = new Caminhao();
            ve.setId(2);
            ve.setPlaca("CS-3599");
            ve.setMarca("Scania");
            ve.setModelo("Linha R");
            ve.setCor("Preto");
            ve.setVelocidadeMax(160);
            ve.setEixos(9);
            ve.setCargaMax(10000);
            return ve;
        }
        return null;
    }
}
