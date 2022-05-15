package controller;

import model.Automovel;

public class FactoryAutomovel extends FactoryVeiculo {

    public model.Veiculo setVeiculo(model.Veiculo v) {
        if (v.getId() == 1) {
            Automovel ve = new Automovel();
            ve.setId(1);
            ve.setPlaca("CH-1434");
            ve.setMarca("Honda");
            ve.setModelo("City");
            ve.setCor("Azul");
            ve.setVelocidadeMax(280);
            ve.setPortas(4);
            ve.setAno(2018);
            return ve;
        }
        return null;
    }
}