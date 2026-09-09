package main.entities;

import java.util.ArrayList;
import java.util.List;



public class Maquina {

    private int ponto;
    private List <Carta> cartasMao = new ArrayList();

    public Maquina(){
        
    }

    public Maquina(int ponto, List<Carta> cartasMao) {
        this.ponto = ponto;
        this.cartasMao = cartasMao;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public List<Carta> getCartasMao() {
        return cartasMao;
    }

    public void setCartasMao(List<Carta> cartasMao) {
        this.cartasMao = cartasMao;
    }
}
