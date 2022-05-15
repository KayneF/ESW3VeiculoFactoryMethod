package view;

import controller.*;
import model.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.setId(1);
//        veiculo.setId(2);
//        veiculo.setId(3);
//        veiculo.setId(4);

        if (veiculo.getId() == 1) {
            FactoryVeiculo v1 = new FactoryAutomovel();
            ControleVeiculo c1 = new ControleAutomovel();
            v1.setVeiculo(veiculo);
            Veiculo fv1 = v1.setVeiculo(veiculo);
            c1.inicioMovimentacao(fv1);
            c1.movimentacaoVeiculo(fv1);
        }
        if (veiculo.getId() == 2) {
            FactoryVeiculo v2 = new FactoryCaminhao();
            ControleVeiculo c2 = new ControleCaminhao();
            v2.setVeiculo(veiculo);
            Veiculo fv2 = v2.setVeiculo(veiculo);
            c2.inicioMovimentacao(fv2);
            c2.movimentacaoVeiculo(fv2);
        }
        if (veiculo.getId() == 3) {
            FactoryVeiculo v3 = new FactoryMotocicleta();
            ControleVeiculo c3 = new ControleMotocicleta();
            v3.setVeiculo(veiculo);
            Veiculo fv3 = v3.setVeiculo(veiculo);
            c3.inicioMovimentacao(fv3);
            c3.movimentacaoVeiculo(fv3);
        }
        if (veiculo.getId() == 4) {
            FactoryVeiculo v4 = new FactoryVan();
            ControleVeiculo c4 = new ControleVan();
            v4.setVeiculo(veiculo);
            Veiculo fv4 = v4.setVeiculo(veiculo);
            c4.inicioMovimentacao(fv4);
            c4.movimentacaoVeiculo(fv4);
        }
    }
}
