package main.entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private String name;
    private int ponto;
    private List <Carta> cartasMao = new ArrayList<>();

    public Jogador(){

    }

    public Jogador(String name, int ponto, List<Carta> cartasMao) {
        this.name = name;
        this.ponto = ponto;
        this.cartasMao = cartasMao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    public void AddCartaMao(){
        
    }
}
