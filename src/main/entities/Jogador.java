package main.entities;

import java.util.ArrayList;
import java.util.List;
import main.enums.Valor;

public class Jogador {

    
    private String name;
    private List <Carta> cartasMao = new ArrayList<>();

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
        ponto = verificarAs(ponto);
        return ponto;

    }
    public int verificarAs( int ponto){
        for(int i = 0 ; i < cartasMao.size(); i++){
            if ((ponto + 10) <= 21){
                if(cartasMao.get(i).getValor() == Valor.As){
                    ponto += 10;
                }
            }
        }

        return ponto;
    }
}
