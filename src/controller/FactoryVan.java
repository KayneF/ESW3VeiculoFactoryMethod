package controller;

import model.Van;

public class FactoryVan extends FactoryVeiculo {

    public model.Veiculo setVeiculo(model.Veiculo v) {
        if (v.getId() == 4) {
            Van ve = new Van();
            ve.setId(4);
            ve.setPlaca("VF-3702");
            ve.setMarca("Ford");
            ve.setModelo("E-Transit");
            ve.setCor("Prata");
            return ve;
        }
        return null;
    }
}
