package main.entities;

import java.util.List;
import main.enums.Decisao;

public class Maquina extends Jogador{

    public Maquina(String name, List<Carta> cartasMao) {
        super(name, cartasMao);
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
