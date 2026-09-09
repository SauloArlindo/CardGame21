package main.entities;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    
    private String name;
    private List <Carta> cartasMao = new ArrayList<>();

    public Jogador(){

    }

    public Jogador(String name, List<Carta> cartasMao) {
        this.name = name;
        this.cartasMao = cartasMao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Carta> getCartasMao() {
        return cartasMao;
    }

    public void setCartasMao(List<Carta> cartasMao) {
        this.cartasMao = cartasMao;
    }
    
    public void addCartaMao(Carta carta){
        cartasMao.add(carta);
    }
    public int calcularPonto(){
        int ponto = 0;
        for (int i = 0 ; i < cartasMao.size(); i ++){
            ponto += cartasMao.get(i).getValor().getPontos();
        }
        return ponto;
    }
}
