package com.fiap.exercicio;

import com.fiap.exercicio.adapter.TabelaTaxaVeiculoLeveAdapter;
import com.fiap.exercicio.adapter.TabelaTaxaVeiculoPesadoAdapter;
import com.fiap.exercicio.lib.TabelaTaxaVeiculoLeve;
import com.fiap.exercicio.lib.TabelaTaxaVeiculoPesado;
import com.fiap.exercicio.logger.LocacaoLogger;
import com.fiap.exercicio.veiculo.Bicicleta;
import com.fiap.exercicio.veiculo.Caminhao;
import com.fiap.exercicio.veiculo.Carro;
import com.fiap.exercicio.veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioMain {

    public static void main(String[] args) {


        LocacaoLogger.getInstancia().logarLocacao("Iniciando locacao");

        TabelaTaxaVeiculoLeveAdapter tabelaTaxaVeiculoLeve = new TabelaTaxaVeiculoLeveAdapter(new TabelaTaxaVeiculoLeve());
        TabelaTaxaVeiculoPesadoAdapter tabelaTaxaVeiculoPesado = new TabelaTaxaVeiculoPesadoAdapter(new TabelaTaxaVeiculoPesado());

        Veiculo carro = new Carro(10D, tabelaTaxaVeiculoLeve, 1);
        Veiculo caminhao = new Caminhao(10D, tabelaTaxaVeiculoPesado, 100D);
        Veiculo bicicleta = new Bicicleta(10D, tabelaTaxaVeiculoLeve);

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(carro);
        veiculos.add(caminhao);
        veiculos.add(bicicleta);

        Double precoTotal = 0D;

        for (Veiculo veiculo : veiculos) {
            precoTotal += veiculo.obterValorTotal();
        }
        LocacaoLogger.getInstancia().logarLocacao("Valor total da locacao: " + precoTotal);
        LocacaoLogger.getInstancia().logarLocacao("Finalizando locacao");
    }

}
