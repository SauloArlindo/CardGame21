package main.entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.enums.Naipe;
import main.enums.Valor;


public final class Baralho {

    private Carta carta;
    
    private List<Carta> baralho = new ArrayList<>();

   public Baralho(){
        ContruirBaralho();
        Embaralhar();
   }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void ContruirBaralho(){
        for(Naipe simboloNaipe : Naipe.values()){
            for(Valor valorCarta : Valor.values()){                
                baralho.add(new Carta(simboloNaipe,valorCarta));
            }
        }
    }
    
    public void Embaralhar(){
        Collections.shuffle(baralho);
    }
    public List RetirarCarta(){
        List<Carta> retirada = new ArrayList<>();
    }
}
