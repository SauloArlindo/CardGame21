package main.entities;

import main.enums.Decisao;

public class Maquina extends Jogador{

    public Maquina(String name) {
        super(name);
    }

    public Decisao  decidirJogada(){
        int pontomaq = calcularPonto();
        if (pontomaq < 18){
            return Decisao.COMPRAR;
        }else{
            return Decisao.PARAR;
        }
    }

}
