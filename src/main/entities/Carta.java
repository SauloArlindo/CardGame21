package main.entities;

import main.enums.Naipe;
import main.enums.Valor;

public class Carta {
    private Naipe naipe;
    private Valor valor;
    
    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;

    }
    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carta{");
        sb.append(", valor=").append(valor);
        sb.append("naipe=").append(naipe);
        sb.append('}');
        return sb.toString();
    }


}
