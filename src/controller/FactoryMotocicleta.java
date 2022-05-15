package controller;

import model.Motocicleta;

public class FactoryMotocicleta extends FactoryVeiculo {

    public model.Veiculo setVeiculo(model.Veiculo v) {
        if (v.getId() == 3) {
            Motocicleta ve = new Motocicleta();
            ve.setId(3);
            ve.setPlaca("MH-2020");
            ve.setMarca("Honda");
            ve.setModelo("CB650R");
            ve.setCor("Vermelho");
            ve.setVelocidadeMax(220);
            ve.setCilindradas(88);
            return ve;
        }
        return null;
    }
}
